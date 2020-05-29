import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test {
    public static void main(String[] args) throws Exception{
        //Read File
        File file = new File("notes3.txt");
        ArrayList<String> WorkedList = new ArrayList<>();
        ArrayList<String> UnWorkedList = new ArrayList<>();
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();

        while (line != null) {
            //Get Request
            String name = line;
            String url1 = "https://www.instagram.com/web/search/topsearch/?context=blended&query=";
            String url2 = "&rank_token=0.6342094475169566&include_reel=true";
            String url = url1 + name + url2;
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            //End Get Request

            //JSON
            JSONParser parser = new JSONParser();
            Object obj1 = parser.parse(response.toString());
            JSONObject jsonObj = (JSONObject) obj1;
            JSONArray msg = (JSONArray) jsonObj.get("users");
            boolean Flag = false;
            for (int i = 0; i < msg.size(); i++){
                JSONObject jsonObj2 = (JSONObject) msg.get(i);
                JSONObject jsonObj3 = (JSONObject) jsonObj2.get("user");
                String name11 = jsonObj3.get("username").toString();
                if (name11.equals(name)){
                    WorkedList.add(name11);
                    Flag = true;
                }

            }
            if (Flag == false){
                UnWorkedList.add(name);
            }
            //JSON End
            line = reader.readLine();
        }
        //End Read File


        //Write File
        FileWriter writer = new FileWriter("notes4.txt");
        writer.write("Работающие: ");
        writer.write(System.getProperty("line.separator"));
        for (String write_line: WorkedList){
            writer.write(write_line);
            writer.write(System.getProperty("line.separator"));
        }
        writer.write("Неработающие: ");
        writer.write(System.getProperty("line.separator"));
        for (String write_line: UnWorkedList){
            writer.write(write_line);
            writer.write(System.getProperty("line.separator"));
        }
        writer.close();
        //End Write File

    }
}
