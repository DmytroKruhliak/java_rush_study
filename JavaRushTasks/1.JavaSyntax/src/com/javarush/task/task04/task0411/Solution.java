package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {

        if ((month >= 3) && (5 >= month)) {
            System.out.println("весна");
        } else if ((month >= 6) && (8 >= month)) {
            System.out.println("лето");
        } else if ((month >= 9) && (11 >= month)) {
            System.out.println("осень");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        }

    }
}