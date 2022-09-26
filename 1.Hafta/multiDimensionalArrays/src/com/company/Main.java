package com.company;

public class Main {

    public static void main(String[] args) {
	String [][] sehirler = new String [3][3];

    sehirler[0][0] = "İstanbul";
    sehirler[0][1] = "Kocaeli";
    sehirler[0][2] = "Edirne";
    sehirler[1][0] = "Manisa";
    sehirler[1][1] = "İzmir";
    sehirler[1][2] = "Aydin";
    sehirler[2][0] = "Ordu";
    sehirler[2][1] = "Samsun";
    sehirler[2][2] = "Giresun";

    for(int i = 0;i<=2;i++){
        System.out.println("---------------------------");
        for(int j = 0;j<=2;j++){
            System.out.println(sehirler[i][j]);
        }
    }

    }
}
