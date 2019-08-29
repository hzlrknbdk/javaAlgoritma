package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru10 {

    // Kullanıcıdan ismini ve soyismini alarak içerisinde kaç adet sesli kaç adet sessiz harf olduğunu bulan programı yazınız.

    public static void main(String[] args) {

        String isim;
        int sesliHarfSayisi = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminiz");
        isim = scan.nextLine();
        for (int i = 0; i < isim.length(); i++) {
            char c = isim.charAt(i);
            if (c == 'a' || c == 'e' || c == 'ı' || c == 'i' || c == 'u' || c == 'ü' || c == 'o' || c == 'ö') {
                sesliHarfSayisi++;
            }
        }
        System.out.println("Sesli Harf Sayısı: " + sesliHarfSayisi);
        System.out.println("Sessiz Harf Sayısı: " + (isim.length() - sesliHarfSayisi));

    }
}
