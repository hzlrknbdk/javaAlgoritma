package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru4 {
    //İkinci dereceden ax^2 + bx + c = 0 denkleminin diskriminant çözümünü yapınız?
    // Kullanıcıdan a,b ve c değerlerini alarak deltayı hesaplayınız?

    public static void main(String[] args) {
        int a, b, c, delta;
        float kok1, kok2;
        Scanner scan = new Scanner(System.in);

        System.out.println("a sayısı: ");
        a = scan.nextInt();

        System.out.println("b sayısı: ");
        b = scan.nextInt();

        System.out.println("c sayısı: ");
        c = scan.nextInt();

        delta = b * b - (4 * a * c);

        if (delta > 0) {
            System.out.println("Denklemin iki kökü vardır.");
            kok1 = (float) (-b - Math.sqrt(delta)) / 2 * a;
            kok2 = (float) (-b + Math.sqrt(delta)) / 2 * a;

            System.out.println("Kök 1=" + kok1);
            System.out.println("Kök 2=" + kok2);
        } else if (delta == 0) {
            System.out.println("Denklemin çakışık kökü vardır.");
            kok1 = (float) (-b) / 2 * a;
            System.out.println("Kökler=" + kok1);
        } else System.out.println("Denklemin kökü yoktur.");

    }
}
