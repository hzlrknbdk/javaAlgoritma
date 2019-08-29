package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru14 {

    // Kullanıcının istediği kadar sayıyı, kullanıcıdan alarak bir diziye aktaran,
    // bu sayıların toplamını ve ortalamasını bulan programını yazınız?

    public static void main(String[] args) {
        int diziBoyut;
        float ortalama;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz.");
        diziBoyut = scan.nextInt();

        int[] dizi = new int[diziBoyut];

        for (int i = 0; i < diziBoyut; i++) {
            System.out.println(i + ". eleman:");
            dizi[i] = scan.nextInt();
            toplam += dizi[i];
        }

        ortalama = (float) toplam / diziBoyut;
        System.out.println("Dizideki sayıların toplamı: " + toplam);
        System.out.println("Dizideki sayıların ortalaması: " + ortalama);

    }
}
