package com.company.week3;

import java.util.Scanner;

public class Dates {
    public static void main (String[] args) {
        int year, month, day, daysInMonth, yearAfter, monthAfter, dayAfter;
        boolean leap = false, print = true;

        Scanner scanner = new Scanner(System.in);
        //Scans user input for year, month and day
        System.out.println("Indtast år:");
        year = scanner.nextInt();
        System.out.println("Indtast måned:");
        month = scanner.nextInt();
        System.out.println("Indtast dag:");
        day = scanner.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("Ugyldig dato");
            print = false;
        } else if (day > 31 || day < 1){
            System.out.println("Ugyldig dato");
            print = false;
        }

        if (year % 4 == 0) {
            leap = true;
            if (year % 100 == 0) {
                leap = false;
                if (year % 400 == 0) {
                    leap = true;
                }
            }
        }


        switch (month) {
            case 2:
                if (!leap) {
                daysInMonth = 28;
                if (day > 28) {
                    System.out.println("Ugyldig dato");
                    print = false;
                }
                } else {
                    daysInMonth = 29;
                    if (day > 29) {
                        System.out.println("Ugyldig dato");
                        print = false;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30){
                    System.out.println("Ugyldig dato");
                    print = false;
                }
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        if (day == daysInMonth) {
            dayAfter = 1;
            if (month == 12){
                monthAfter = 1;
            } else {
                monthAfter = month + 1;
            }
        } else {
            dayAfter = day + 1;
            monthAfter = month;
        }


        if (month == 12 && day == 31){
            yearAfter = year + 1;
        } else {
            yearAfter = year;
        }

        if (print) {
            System.out.println("Dagen efter " + day + "/" + month + " " + year + " er " + dayAfter + "/" + monthAfter + " " + yearAfter);
        }


    }
}
