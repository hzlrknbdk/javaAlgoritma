package com.company.youtubeAlgoritma;

public class soru11 {

    //0 ile 1000 arasındaki Fibonacci sayılarını bulan programı yazınız?

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;

        do {
            c = a + b;
            if (c > 1000) break;
            System.out.print(c + " - ");
            a = b;
            b = c;
        } while (c < 1000);


    }
}
