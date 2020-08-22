package com.company.week3;

import java.util.Scanner;

public class PasswordAgain {
    public static void main (String[] args){
//        Scans something from the terminal
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        //Checks the password
        if (password.length() < 5){
            System.out.println("Password for kort");

        } else if (password.length() > 8) {
            System.out.println("Password for langt");

        } else {
            System.out.println("Password tilpas");
        }
        //Closes the scanner
        scanner.close();


    }
}
