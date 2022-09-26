package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner number = new Scanner(System.in);
        System.out.println("Bir sayi girin:");
        int sayi = number.nextInt();

        boolean isPrime = true;

        for(int i = 2;i<sayi;i++){
            if(sayi % 2 == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Sayi asaldir.");
        }
        else{
            System.out.println("Sayi asal degildir.");
        }

    }
}
