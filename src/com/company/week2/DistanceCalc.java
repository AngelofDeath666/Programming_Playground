package com.company.week2;

import java.util.Scanner;

public class DistanceCalc {
    public static void main (String[] args){
        double a, b, x, y, dist;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        x = scanner.nextDouble();
        y = scanner.nextDouble();

       dist = Math.abs(a*x-y+b)/Math.sqrt(1+a*a);

        System.out.println(dist);

    }
}
