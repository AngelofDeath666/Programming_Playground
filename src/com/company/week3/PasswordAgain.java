package com.company.week3;

import java.util.Scanner;

public class PasswordAgain {
    public static void main (String[] args){
//        Scans something from the terminal
        String password;
        Scanner scanner = new Scanner(System.in);

        //Checks the password and loops until password is between 5 and 8
        do{
            password = scanner.nextLine();
            if (password.length() < 5){
                System.out.println("Password for kort");

            } else if (password.length() > 8) {
                System.out.println("Password for langt");

            }
        } while (password.length() < 5 || password.length() > 8);
        System.out.println("Password tilpas");

        //Closes the scanner
        scanner.close();


    }
}
