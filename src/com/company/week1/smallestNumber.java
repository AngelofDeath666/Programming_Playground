package com.company.week1;

import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) {
        double a = 0;
        Scanner scr = new Scanner(System.in);

        String numbers = scr.nextLine();
        scr.close();
        String[] numb = numbers.split("\\s");
        double[] array1 = new double[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Double.parseDouble(numb[i]);
        }

        for (int j = 0; j < 2; j++) {
            if (array1[j] > array1[j+1] ) {
                a = array1[j];
            }
        }
        System.out.println(a);



    }
}
