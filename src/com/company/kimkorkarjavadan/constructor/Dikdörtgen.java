package com.company.kimkorkarjavadan.constructor;

public class Dikdörtgen {
    private double en;
    private double boy;

    public Dikdörtgen() {

    }

    public Dikdörtgen(double x, double y) {
        this.en = x;
        this.boy = y;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double x) {

        if (x < 0) {
            en = x * (-1);
        } else en = x;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double y) {
        if (y < 0) {
            boy = y * (-1);

        } else boy = y;
    }

    public double DikdortgenAlanı() {
        return en * boy;
    }
}
