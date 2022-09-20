package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir.
        //28 --> 1+2+4+7+14=28
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = reader.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;

            }
        }
        if (total == number) {
            System.out.println(number + " sayisi" +" Mukemmel Sayidir");
        } else {
            System.out.println(number + " sayisi  " +" Mukemmel Sayi Degildir");
        }


    }
}
