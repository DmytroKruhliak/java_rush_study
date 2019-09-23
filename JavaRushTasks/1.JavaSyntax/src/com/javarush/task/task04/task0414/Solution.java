package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int getYear = Integer.parseInt(br.readLine());

        thatYear(getYear);
    }

    public static void thatYear(int year) {

        String leapYear = "количество дней в году: 366";
        String regularYear = "количество дней в году: 365";

        if (year % 400 == 0) {
            System.out.println(leapYear);
        } else if (year % 100 == 0) {
            System.out.println(regularYear);
        } else if (year % 4 == 0) {
            System.out.println(leapYear);
        } else {
            System.out.println(regularYear);
        }
    }
}