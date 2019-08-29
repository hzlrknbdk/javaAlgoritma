package com.company.youtubeAlgoritma;

public class soru12 {

    // 0 ile 100 arasındaki Asal sayıları bulan programı yazınız?

    public static void main(String[] args) {
        int bolenSayi = 0;
        int i, j;

        for (i = 2; i < 100; i++) { // bölünen sayıları döndürür.
            //  if(i==2) System.out.println("2 sayısı en küçük asal sayıdır.");
            for (j = 2; j < i; j++) { //bölen sayıları döndüren kısım
                if (i % j == 0) bolenSayi++;

            }
            if (bolenSayi == 0) System.out.println(i + " - ");
            bolenSayi = 0;

        }

    }
}
