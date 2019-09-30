package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        infoAboutNumber(a);
    }

    private static void infoAboutNumber(int a) {
        if (a > 999 || a < 1) return;
        System.out.println(evenOrNotEven(a) + " "
                + signifOfDigit(a) + " " +
                "число");
    }

    private static String evenOrNotEven(int a) {
        return a % 2 != 0 ? "нечетное" : "четное";
    }

    private static String signifOfDigit(int a) {
        //if (a < 9) return "однозначное";
        if (a > 9 && a < 100) return "двузначное";
        if (a > 99 && a < 1000) return "трехзначное";
        return "однозначное";
    }


}
