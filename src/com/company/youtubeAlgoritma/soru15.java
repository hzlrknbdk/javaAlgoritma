package com.company.youtubeAlgoritma;

import java.util.Random;

public class soru15 {

    //3X3 rastgele sayılardan oluşan 2 matris oluşturun.Bu matrislerin, toplamını hesaplayınız.

    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] t = new int[3][3];

        Random r = new Random();
        System.out.println("M1 matrisi:");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = r.nextInt(5);
                System.out.print(m1[i][j] + "  ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("M2 matrisi:");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = r.nextInt(10);
                System.out.print(m2[i][j] + "  ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("T matrisi:");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = m1[i][j] + m2[i][j];
                System.out.print(t[i][j] + "  ");
            }
            System.out.println();

        }


    }
}
