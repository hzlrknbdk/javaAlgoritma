package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru2 {

    // Kullanıcıdan iki sayı alarak bunların toplamını ve ortalamasını ekrana yazan programı yazınız?

    public static void main(String[] args) {
        int sayi1, sayi2, toplam;
        float ortalama;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz: ");
        sayi1 = scan.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz: ");
        sayi2 = scan.nextInt();
        toplam = sayi1 + sayi2;
        ortalama = toplam / 2;

        System.out.println("2 sayının toplamı " + toplam + "'dır.");
        System.out.println("2 sayının ortalaması " + ortalama + "'dır.");

    }
}
