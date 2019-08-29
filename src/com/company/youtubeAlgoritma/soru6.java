package com.company.youtubeAlgoritma;

public class soru6 {
    //Birden yüze kadar olan sayıların toplamı
    public static void main(String[] args) {
        int i;
        int toplam = 0;

        for (i = 1; i <= 100; i++) {
            // toplam = toplam + i;
            toplam += i;
        }
        System.out.println("1-100 arası sayıların toplamı: " + toplam);
    }
}
