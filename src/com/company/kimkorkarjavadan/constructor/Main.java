package com.company.kimkorkarjavadan.constructor;

public class Main {

    public static void main(String[] args) {

        Dikdörtgen dd1 = new Dikdörtgen();
        Dikdörtgen dd2 = new Dikdörtgen();

        dd1.setBoy(40);
        dd1.setEn(-3);
        dd2.setBoy(2);
        dd2.setEn(6);
//        dd1.boy = 7;
//        dd2.boy = 8;
//
        System.out.println("dd1 dikdörtgeninin alanı= " + dd1.DikdortgenAlanı());
        System.out.println("dd2 dikdörtgeninin alanı= " + dd2.DikdortgenAlanı());


    }
}
