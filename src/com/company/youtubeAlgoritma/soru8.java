package com.company.youtubeAlgoritma;

import java.util.Scanner;

public class soru8 {

    //n'den m'ye kadar olan sayılardan 7'ye tam bölünenleri bulunuz?
    // n başlangıç ve m bitiş sayısı kullanıcıdan alınacaktır.

    public static void main(String[] args) {

        int i, n, m;
        Scanner scan = new Scanner(System.in);
        System.out.println("n sayısı: ");
        n = scan.nextInt();
        System.out.println("m sayısı");
        m = scan.nextInt();

        for (i = n; i < m; i++){
            if(i%7==0) System.out.println( i+ "  ");
        }

    }
}
