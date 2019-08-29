package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru1 {
    // Kullanıcıdan ismini alarak "Merhaba isim" yazan programı yazınız?
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz.");
        name = scan.nextLine();
        System.out.println("Merhaba " + name);


    }
}
