package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {

    private static String[] dayOfTheWeek = {
            "понедельник",
            "вторник",
            "среда",
            "четверг",
            "пятница",
            "суббота",
            "воскресенье"};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int getNumb = Integer.parseInt(br.readLine());

        whatDayOfTheWeek(getNumb);


    }

    private static void whatDayOfTheWeek(int day) {

        if (0 >= day || day > dayOfTheWeek.length) {
            System.out.println("такого дня недели не существует");
        } else {
            System.out.println(dayOfTheWeek[day - 1]);
        }
    }
}