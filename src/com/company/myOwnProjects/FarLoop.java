package com.company.myOwnProjects;

import java.util.Scanner;

public class FarLoop {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String greeting = "Indtast venligst dit navn nedenunder. (luk for at lukke programmet)";
        String far = "Du er fantastisk!";
        String andre = "Du er sød";

        System.out.println(greeting);
        String name = scanner.nextLine();

        while (!name.equalsIgnoreCase("luk")){
            if (name.equalsIgnoreCase("jens kejser hansen")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("jens hansen")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("jens kejser")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("jens")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("kejser hansen")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("hansen")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("far")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("farmand")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("den gamle avis")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("gamle avis")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("Degnebaklen")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("Degnebakken")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("kejser")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("jenshansen")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("jenskejser")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("kejserhansen")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("dengamleavis")){
                System.out.println(far);
            } else if (name.equalsIgnoreCase("gamleavis")){
                System.out.println(far);
            } else {
                System.out.println(andre);
            }
            System.out.println(greeting);
            name = scanner.nextLine();
        }


    }
}
