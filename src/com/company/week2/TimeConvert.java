package com.company.week2;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args){
        int initialSec, sec, minute, hour, days, calcMinute, calcHour, calcDays;
        Scanner scanner = new Scanner(System.in);
        initialSec = scanner.nextInt();
        minute = 60;
        hour = 3600;
        days = 86400;

        calcDays = initialSec / days;
        sec = initialSec % days;
        calcHour = sec / hour;
        sec = sec % hour;
        calcMinute = sec / minute;
        sec = sec % minute;

        System.out.println(initialSec + " seconds equals " + calcDays + " days, " + calcHour + " hours, " + calcMinute + " minutes and " + sec + " seconds.");

    }
}
