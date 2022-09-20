package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
        System.out.println("Bir harf girin:");
        char harf = reader.next().charAt(0);

        switch(harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}
