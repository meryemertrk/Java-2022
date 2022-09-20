package com.company;

public class Main {

    public static void main(String[] args) {
	String ogrenci1 = "Meryem";
    String ogrenci2 = "Merve";
    String ogrenci3 = "Hatice";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("--------------------------");
     String [] ogrenciler = new String[3];
     ogrenciler[0] = "Meryem";
     ogrenciler[1] = "Merve";
     ogrenciler[2] = "Hatice";

     for(int i = 0;i<ogrenciler.length;i++){
         System.out.println(ogrenciler[i]);
     }

        System.out.println("-----------------------------");
     //2.yol
     for(String ogrenci:ogrenciler){
         System.out.println(ogrenci);
     }

     int [] myList = new int [5];
     myList[0] = 5;
     myList[1] = 7;
     myList[2] = 1;
     myList[3] = 9;
     myList[4] = 3;
     int total = 0;
     int max = myList[0];

     for(int i = 0;i< myList.length;i++){
         System.out.println(myList[i]);
         total = total + myList[i];
         if(max<myList[i]){
             max = myList[i];
         }

     }
        System.out.println("Toplam = " + total);
        System.out.println("En Buyuk = " + max);
    }
}
