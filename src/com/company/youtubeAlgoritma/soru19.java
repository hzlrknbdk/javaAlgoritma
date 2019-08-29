package com.company.youtubeAlgoritma;

public class soru19 {
    // 1 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?
    public static void main(String[] args) {

        int randomSayi = (1 + (int) (Math.random() * 1000));
        System.out.println("Random sayımız:" + randomSayi);
        int birler = randomSayi %10; //birler basamağı

        randomSayi = randomSayi /10;

        int onlar = randomSayi %10;   //onlar basamağı

        int yuzler = randomSayi /10;  //yüzler basamağı

        System.out.println("Toplamları ="+(birler+onlar+yuzler));




    }
}
