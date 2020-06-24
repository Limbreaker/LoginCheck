import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;


public class Test {

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("WorkedList.txt");
        writer.write("");
        writer.close();
        FileWriter writer2 = new FileWriter("UnWorkedList.txt");
        writer2.write("");
        writer2.close();
        Date currentTime = new Date();   // берем дату до метода.
        System.out.println(currentTime);

        //Read File
        File file = new File("notes3.txt");

        ArrayList<String> ListAll = new ArrayList<>();

        ArrayList<String> ListThread1 = new ArrayList<>();
        ArrayList<String> ListThread2 = new ArrayList<>();
        ArrayList<String> ListThread3 = new ArrayList<>();
        ArrayList<String> ListThread4 = new ArrayList<>();
        ArrayList<String> ListThread5 = new ArrayList<>();
        ArrayList<String> ListThread6 = new ArrayList<>();
        ArrayList<String> ListThread7 = new ArrayList<>();
        ArrayList<String> ListThread8 = new ArrayList<>();
        ArrayList<String> ListThread9 = new ArrayList<>();
        ArrayList<String> ListThread10 = new ArrayList<>();
        ArrayList<String> ListThread11 = new ArrayList<>();
        ArrayList<String> ListThread12 = new ArrayList<>();
        ArrayList<String> ListThread13 = new ArrayList<>();
        ArrayList<String> ListThread14 = new ArrayList<>();
        ArrayList<String> ListThread15 = new ArrayList<>();
        ArrayList<String> ListThread16 = new ArrayList<>();
        ArrayList<String> ListThread17 = new ArrayList<>();
        ArrayList<String> ListThread18 = new ArrayList<>();
        ArrayList<String> ListThread19 = new ArrayList<>();
        ArrayList<String> ListThread20 = new ArrayList<>();
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            ListAll.add(line);
            line = reader.readLine();
        }
        int lenList = ListAll.size();
        System.out.println(lenList);

        //Разделение файла на 2 списка

        int countList1 = lenList % 20;
        int countList = (lenList - countList1) / 20;
        System.out.println(countList);
        int count = 0;
        for (int i = 0; i < lenList; i++){
            count += 1;
            if(count <= countList) {
                ListThread1.add(ListAll.get(i));
            }
            else if(count > countList & count <=2*countList) {
                ListThread2.add(ListAll.get(i));
            }
            else if(count > 2*countList & count <= 3*countList){
                ListThread3.add(ListAll.get(i));
            }
            else if(count > 3*countList & count <= 4*countList){
                ListThread4.add(ListAll.get(i));
            }
            else if(count > 4*countList & count <= 5*countList){
                ListThread5.add(ListAll.get(i));
            }
            else if(count > 5*countList & count <= 6*countList){
                ListThread6.add(ListAll.get(i));
            }
            else if(count > 6*countList & count <= 7*countList){
                ListThread7.add(ListAll.get(i));
            }
            else if(count > 7*countList & count <= 8*countList){
                ListThread8.add(ListAll.get(i));
            }
            else if(count > 8*countList & count <= 9*countList){
                ListThread9.add(ListAll.get(i));
            }
            else if(count > 9*countList & count <= 10*countList){
                ListThread10.add(ListAll.get(i));
            }
            else if(count > 10*countList & count <=11*countList) {
                ListThread11.add(ListAll.get(i));
            }
            else if(count > 11*countList & count <= 12*countList){
                ListThread12.add(ListAll.get(i));
            }
            else if(count > 12*countList & count <= 13*countList){
                ListThread13.add(ListAll.get(i));
            }
            else if(count > 13*countList & count <= 14*countList){
                ListThread14.add(ListAll.get(i));
            }
            else if(count > 14*countList & count <= 15*countList){
                ListThread15.add(ListAll.get(i));
            }
            else if(count > 15*countList & count <= 16*countList){
                ListThread16.add(ListAll.get(i));
            }
            else if(count > 16*countList & count <= 17*countList){
                ListThread17.add(ListAll.get(i));
            }
            else if(count > 17*countList & count <= 18*countList){
                ListThread18.add(ListAll.get(i));
            }
            else if(count > 18*countList & count <= 19*countList){
                ListThread19.add(ListAll.get(i));
            }
            else if(count > 19*countList & count <= lenList){
                ListThread20.add(ListAll.get(i));
            }
        }
        //Конец разделения

        PeopleQueue queue1 = new PeopleQueue(ListThread1);
        PeopleQueue queue2 = new PeopleQueue(ListThread2);
        PeopleQueue queue3 = new PeopleQueue(ListThread3);
        PeopleQueue queue4 = new PeopleQueue(ListThread4);
        PeopleQueue queue5 = new PeopleQueue(ListThread5);
        PeopleQueue queue6 = new PeopleQueue(ListThread6);
        PeopleQueue queue7 = new PeopleQueue(ListThread7);
        PeopleQueue queue8 = new PeopleQueue(ListThread8);
        PeopleQueue queue9 = new PeopleQueue(ListThread9);
        PeopleQueue queue10 = new PeopleQueue(ListThread10);
        PeopleQueue queue11 = new PeopleQueue(ListThread11);
        PeopleQueue queue12 = new PeopleQueue(ListThread12);
        PeopleQueue queue13 = new PeopleQueue(ListThread13);
        PeopleQueue queue14 = new PeopleQueue(ListThread14);
        PeopleQueue queue15 = new PeopleQueue(ListThread15);
        PeopleQueue queue16 = new PeopleQueue(ListThread16);
        PeopleQueue queue17 = new PeopleQueue(ListThread17);
        PeopleQueue queue18 = new PeopleQueue(ListThread18);
        PeopleQueue queue19 = new PeopleQueue(ListThread19);
        PeopleQueue queue20 = new PeopleQueue(ListThread20);
        queue1.start(); //Запускаем одну очередь (дочерний поток)
        queue2.start(); //Запускаем вторую (дочерний поток)
        queue3.start(); //Запускаем одну очередь (дочерний поток)
        queue4.start(); //Запускаем вторую (дочерний поток)
        queue5.start(); //Запускаем одну очередь (дочерний поток)
        queue6.start(); //Запускаем вторую (дочерний поток)
        queue7.start(); //Запускаем одну очередь (дочерний поток)
        queue8.start(); //Запускаем вторую (дочерний поток)
        queue9.start(); //Запускаем одну очередь (дочерний поток)
        queue10.start(); //Запускаем вторую (дочерний поток)
        queue11.start(); //Запускаем одну очередь (дочерний поток)
        queue12.start(); //Запускаем вторую (дочерний поток)
        queue13.start(); //Запускаем одну очередь (дочерний поток)
        queue14.start(); //Запускаем вторую (дочерний поток)
        queue15.start(); //Запускаем одну очередь (дочерний поток)
        queue16.start(); //Запускаем вторую (дочерний поток)
        queue17.start(); //Запускаем одну очередь (дочерний поток)
        queue18.start(); //Запускаем вторую (дочерний поток)
        queue19.start(); //Запускаем одну очередь (дочерний поток)
        queue20.start(); //Запускаем вторую (дочерний поток)
        Date newTime = new Date();     // берем время после метода.

        long long1 = currentTime.getTime() - newTime.getTime();
        System.out.println(long1);
        System.out.println(newTime);

    }

}


class PeopleQueue<filePath> extends Thread {
    ArrayList<String> UnWorkedList1 = new ArrayList<>();
    ArrayList<String> WorkedList1 = new ArrayList<>();

    private ArrayList[] names;
    PeopleQueue(ArrayList... names) {
        this.names = names;

    }


    @Override
    public void run(){ // Этот метод будет вызван при старте потока

        for (int i = 0; i < names[0].size(); i++) { // Вывод в цикле с паузой 0.5 сек очередного сотрудника
            //Get Request

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
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("94.41.104.125",8080));

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
            System.out.println(response);
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
                try {
                    sleep(1); // Задержка в 0.5 сек
                } catch (Exception e) {}
                if (name11.equals(name)){
                    System.out.println(names[0].get(i) + " - Работает!");
                    WorkedList1.add(name11);
                    Flag = true;
                }
                try {
                    sleep(1); // Задержка в 0.5 сек
                } catch (Exception e) {}

            }
            if (Flag == false){
                UnWorkedList1.add(name);
                System.out.println(names[0].get(i) + " - Не работает!");
            }
            try {
                sleep(1); // Задержка в 0.5 сек
            } catch (Exception e) {}
            //JSON End
        }
        //End Read File
        String filePath = "WorkedList.txt";

        for (String str: WorkedList1
             ) {
            try {
                FileWriter writer = new FileWriter(filePath, true);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                bufferWriter.write(str+"\n");
                bufferWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        String filePath2 = "UnWorkedList.txt";

        for (String str: UnWorkedList1
        ) {
            try {
                FileWriter writer2 = new FileWriter(filePath2, true);
                BufferedWriter bufferWriter = new BufferedWriter(writer2);
                bufferWriter.write(str+"\n");
                bufferWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        }

    }


