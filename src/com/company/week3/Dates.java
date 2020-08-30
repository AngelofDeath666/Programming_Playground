package com.company.week3;

import java.util.Scanner;

public class Dates {
    public static void main (String[] args) {
        int year, month, day, daysInMonth;

        Scanner scanner = new Scanner(System.in);
        //Scans user input for year, month and day
        System.out.println("Indtast år:");
        year = scanner.nextInt();
        System.out.println("Indtast måned:");
        month = scanner.nextInt();
        System.out.println("Indtast dag:");
        day = scanner.nextInt();

        switch (month) {
            case 2:
                daysInMonth = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }



    }
}
