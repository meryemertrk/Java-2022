package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int number1 = reader.nextInt();
        System.out.println("Please enter second number");
        int number2 = reader.nextInt();

        int total1 = 0;
        int total2 = 0;

        for(int i = 1;i<number1;i++){
            if(number1 % i == 0){
                total1 = total1 + i;
            }
        }

        for(int j = 1;j<number2;j++){
            if(number2 % j == 0){
                total2 = total2 + j;
            }
        }

        if(number1 == total2 && number2 == total1){
            System.out.println(number1 + " ve " + number2 + " sayilari" + " arkadas sayilardir");
        }
        else{
            System.out.println(number1 + " ve " + number2 + " sayilari" + " arkadas sayi degiller");
        }
    }
}
