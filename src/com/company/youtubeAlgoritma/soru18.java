package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru18 {
    //Kullanıcıdan alınan bir cümlede kaç adet kelime olduğunu ve kaç adet harf olduğunu bulan programı yazınız?

    public static void main(String[] args) {
        String cumle;
        int sayac = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız.");
        cumle = scan.nextLine();
        System.out.println("Harf sayısı:" + cumle.length());

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') sayac++;

        }
        System.out.println("Kelime sayısı:" + (sayac + 1));
    }
}
