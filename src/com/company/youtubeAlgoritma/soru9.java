package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru9 {

    //Kullanıcıdan ismini alıp ekrana tersten yazan programı yazınız?

    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        name = scan.nextLine();
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

    }
}
