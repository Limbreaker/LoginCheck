import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test {
    public static void main(String[] args) throws Exception {
        //Read File
        File file = new File("notes3.txt");

        ArrayList<String> ListThread1 = new ArrayList<>();
        ArrayList<String> ListThread2 = new ArrayList<>();
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();

        //Разделение файла на 2 списка
        int count = 0;
        while (line != null) {

            if (count != 505) {
                count += 1;
                ListThread1.add(line);
            } else {
                ListThread2.add(line);
            }

            line = reader.readLine();
        }
        //Конец разделения

        PeopleQueue queue1 = new PeopleQueue(ListThread1);
        PeopleQueue queue2 = new PeopleQueue(ListThread2);
        queue1.start(); //Запускаем одну очередь (дочерний поток)
        queue2.start(); //Запускаем вторую (дочерний поток)

    }
}


class PeopleQueue extends Thread {
    ArrayList<String> WorkedList = new ArrayList<>();
    ArrayList<String> UnWorkedList = new ArrayList<>();
    private ArrayList[] names;

    PeopleQueue(ArrayList... names) {
        this.names = names;

    }

    @Override
    public void run(){ // Этот метод будет вызван при старте потока

        for (int i = 0; i < names[0].size(); i++) { // Вывод в цикле с паузой 0.5 сек очередного сотрудника
            //Get Request
            System.out.println(names[0].get(i));
            String name = names[0].get(i).toString();
            String url1 = "https://www.instagram.com/web/search/topsearch/?context=blended&query=";
            String url2 = "&rank_token=0.6342094475169566&include_reel=true";
            String url = url1 + name + url2;
            URL obj = null;
            try {
                obj = new URL(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) obj.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                connection.setRequestMethod("GET");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String inputLine = null;
            StringBuffer response = new StringBuffer();
            while (true) {
                try {
                    if (!((inputLine = in.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                response.append(inputLine);
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //End Get Request

            //JSON
            JSONParser parser = new JSONParser();
            Object obj1 = null;
            try {
                obj1 = parser.parse(response.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            JSONObject jsonObj = (JSONObject) obj1;
            JSONArray msg = (JSONArray) jsonObj.get("users");
            boolean Flag = false;
            for (int i1 = 0; i1 < msg.size(); i1++){
                JSONObject jsonObj2 = (JSONObject) msg.get(i1);
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
        }
        //End Read File


        //Write File
        FileWriter writer = null;
        try {
            writer = new FileWriter("notes4.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write("Работающие: ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(System.getProperty("line.separator"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String write_line: WorkedList){
            try {
                writer.write(write_line);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.write(System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.write("Неработающие: ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(System.getProperty("line.separator"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String write_line: UnWorkedList){
            try {
                writer.write(write_line);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.write(System.getProperty("line.separator"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //End Write File

        }
    }

