package com.company;

import java.util.Scanner;

public class LowestNumber {
    public static void main(String [] args) {
        double a, b, c;
        double lowest;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double[] arrray = {a,b,c};

        for (int i = 0; i < 2; i++){
            if (arrray[i] < arrray[i+1] && i < 1){
                 lowest = arrray[i];
            }
        }
        System.out.println(lowest);

    }
}
