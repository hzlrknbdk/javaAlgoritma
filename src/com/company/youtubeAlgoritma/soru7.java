package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru7 {

    // 1'den n'e kadar olan sayılardan tek olanların toplamını bulunuz?
    // n sayısı kullanıcıdan alınacaktır.

    public static void main(String[] args) {
        int i, n;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("n sayısını giriniz:");
        n = scan.nextInt();
        for (i = 1; i < n; i++) {
            if (i % 2 == 1)
                toplam = toplam + i;
        }
        System.out.println("1-n arası tek sayıların toplamı= " + toplam);
    }
}
