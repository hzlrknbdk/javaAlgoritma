package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru13 {

    // Kullanıcıdan 10 adet sayı alan ve tek ve çift sayıların adetini, toplamını ve ortalamalarını bulan programını yazınız?

    public static void main(String[] args) {

        int tekAdet = 0;
        int ciftAdet = 0;
        int tekToplam = 0;
        int ciftToplam = 0;
        int i, sayi;

        float tekOrt, ciftOrt;

        Scanner scan = new Scanner(System.in);
        for (i = 1; i < 11; i++) {
            System.out.println(i + ". sayı: ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                ciftAdet++;
                ciftToplam += sayi;
            } else tekAdet++;
            tekToplam += sayi;

        }
        System.out.println(ciftAdet + "Çift sayının toplamı: " + ciftToplam);
        System.out.println(tekAdet + "Tek sayının toplamı: " + tekToplam);

        tekOrt = (float) tekToplam / tekAdet;
        ciftOrt = (float) ciftToplam / ciftAdet;

        System.out.println("Cift sayıların ortalaması:" + ciftOrt);
        System.out.println("Tek sayıların ortalaması:" + tekOrt);


    }
}
