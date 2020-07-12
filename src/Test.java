import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;


public class Test {

    public static void main(String[] args) throws Exception {
        //Create and clear new txt files
        FileWriter writer = new FileWriter("WorkedList.txt");
        writer.write("");
        writer.close();
        FileWriter writer2 = new FileWriter("UnWorkedList.txt");
        writer2.write("");
        writer2.close();
        //End Create
        int count = 0;
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
        System.out.println("Всего аккаунтов: " + lenList);

        //Разделение файла на 20 списков
        int countList1 = lenList % 20;
        int countList = (lenList - countList1) / 20;
        System.out.println(countList);
        int count1 = 0;
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

        NewThread queue1 = new NewThread(ListThread1);
        NewThread queue2 = new NewThread(ListThread2);
        NewThread queue3 = new NewThread(ListThread3);
        NewThread queue4 = new NewThread(ListThread4);
        NewThread queue5 = new NewThread(ListThread5);
        NewThread queue6 = new NewThread(ListThread6);
        NewThread queue7 = new NewThread(ListThread7);
        NewThread queue8 = new NewThread(ListThread8);
        NewThread queue9 = new NewThread(ListThread9);
        NewThread queue10 = new NewThread(ListThread10);
        NewThread queue11 = new NewThread(ListThread11);
        NewThread queue12 = new NewThread(ListThread12);
        NewThread queue13 = new NewThread(ListThread13);
        NewThread queue14 = new NewThread(ListThread14);
        NewThread queue15 = new NewThread(ListThread15);
        NewThread queue16 = new NewThread(ListThread16);
        NewThread queue17 = new NewThread(ListThread17);
        NewThread queue18 = new NewThread(ListThread18);
        NewThread queue19 = new NewThread(ListThread19);
        NewThread queue20 = new NewThread(ListThread20);

        // Start Threads
        queue1.start();
        queue2.start();
        queue3.start();
        queue4.start();
        queue5.start();
        queue6.start();
        queue7.start();
        queue8.start();
        queue9.start();
        queue10.start();
        queue11.start();
        queue12.start();
        queue13.start();
        queue14.start();
        queue15.start();
        queue16.start();
        queue17.start();
        queue18.start();
        queue19.start();
        queue20.start();
    }

}





