package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int [] sayilar = new int[] {1,2,3,4,5};
    Scanner reader = new Scanner(System.in);
        System.out.println("Dizide aramak istediginiz sayiyi giriniz:");
    int aranacak = reader.nextInt();
    boolean varMi = false;

      for(int i = 0;i<= sayilar.length;i++) {
          if (aranacak == i) {
              varMi = true;
              break;
          }
      }

     if(varMi){
         System.out.println(aranacak + " sayisi dizide vardir.");
     }
     else{
         System.out.println(aranacak + " sayisi dizide yoktur.");
     }

    }
}
