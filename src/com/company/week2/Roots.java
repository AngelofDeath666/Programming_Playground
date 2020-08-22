package com.company.week2;

import java.util.Scanner;


public class Roots {
    public static void main (String[] args) {
        double a, b, c, d, root1, root2, root0;
        //Scans from the terminal
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        d = b * b - 4 * a * c;

        root0 = -b / 2 * a;
        root1 = (- b + Math.sqrt(d)) / 2 * a;
        root2 = (- b - Math.sqrt(d)) / 2 * a;

        //Remember to close the scanner
        scanner.close();
    }
}
