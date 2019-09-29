package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String info = infoAboutNum(Integer.parseInt(br.readLine()));
        System.out.println(info);
    }

    private static String infoAboutNum(int a) {
        if (a == 0) return "ноль";
        return positiveOrNegative(a) + evenNotEven(a) + "число";
    }

    private static String positiveOrNegative(int a) {
        return (a > 0) ? "положительное " : "отрицательное ";
    }

    private static String evenNotEven(int a) {
        return (a % 2) == 0 ? "четное " : "нечетное ";
    }
}
