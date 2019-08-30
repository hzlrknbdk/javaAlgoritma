package com.company.programiz.arrays;

public class Largest {

    //Find largest element in an array

    public static void main(String[] args) {
        double[] numArray = {23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
        double largest = numArray[0];

        for (double num : numArray) {
            if(largest<num){
                largest=num;
            }

        }
        System.out.format("Largest Element: %.2f" ,largest);

    }
}
