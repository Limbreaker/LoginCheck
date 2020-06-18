import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;


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

        //Разделение файла на 2 списка
        int count = 0;
        while (line != null) {
            count += 1;
            if(count <= 500) {
                ListThread1.add(line);
            }
            else if(count > 500 & count <=1000) {
                ListThread2.add(line);
            }
            else if(count > 1000 & count <= 1500){
                ListThread3.add(line);
            }
            else if(count > 1500 & count <= 2000){
                ListThread4.add(line);
            }
            else if(count > 2000 & count <= 2500){
                ListThread5.add(line);
            }
            else if(count > 2500 & count <= 3000){
                ListThread6.add(line);
            }
            else if(count > 3000 & count <= 3500){
                ListThread7.add(line);
            }
            else if(count > 3500 & count <= 4000){
                ListThread8.add(line);
            }
            else if(count > 4000 & count <= 4500){
                ListThread9.add(line);
            }
            else if(count > 4500 & count <= 5000){
                ListThread10.add(line);
            }
            else if(count > 5000 & count <=5500) {
                ListThread11.add(line);
            }
            else if(count > 5500 & count <= 6000){
                ListThread12.add(line);
            }
            else if(count > 6000 & count <= 6500){
                ListThread13.add(line);
            }
            else if(count > 6500 & count <= 7000){
                ListThread14.add(line);
            }
            else if(count > 7000 & count <= 7500){
                ListThread15.add(line);
            }
            else if(count > 7500 & count <= 8000){
                ListThread16.add(line);
            }
            else if(count > 8000 & count <= 8500){
                ListThread17.add(line);
            }
            else if(count > 8500 & count <= 9000){
                ListThread18.add(line);
            }
            else if(count > 9000 & count <= 9500){
                ListThread19.add(line);
            }
            else if(count > 9500 & count <= 10000){
                ListThread20.add(line);
            }


            line = reader.readLine();
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
                try {
                    sleep(1); // Задержка в 0.5 сек
                } catch (Exception e) {}
                if (name11.equals(name)){
                    WorkedList1.add(name11);
                    Flag = true;
                }
                try {
                    sleep(1); // Задержка в 0.5 сек
                } catch (Exception e) {}

            }
            if (Flag == false){
                UnWorkedList1.add(name);
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


