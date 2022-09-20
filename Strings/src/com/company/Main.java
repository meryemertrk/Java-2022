package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Java Ogreniyorum";
        System.out.println(mesaj);
        System.out.println("Eleman Sayisi: " + mesaj.length());
        System.out.println("1.Eleman: " + mesaj.charAt(0));
        System.out.println(mesaj.concat(" Konumuz Strings"));
        System.out.println(mesaj.startsWith("J"));
        System.out.println(mesaj.endsWith("."));
        char [] karakterler = new char [4];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("Java"));
        System.out.println(mesaj.indexOf('i'));
        System.out.println(mesaj.lastIndexOf("m")); //aramaya sağdan başlar
        System.out.println(mesaj.replace('m','z'));
        System.out.println(mesaj.substring(2,7));
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());
    }
}
