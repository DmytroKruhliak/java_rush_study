package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        numberCounter(a, b, c);
    }

    private static void numberCounter(int a, int b, int c) {

        int positiveCounter = 0;
        int negativeCounter = 0;

        if (a > 0) {
            positiveCounter++;
        } else if (a != 0) {
            negativeCounter++;
        }

        if (b > 0) {
            positiveCounter++;
        } else if (b != 0) {
            negativeCounter++;
        }

        if (c > 0) {
            positiveCounter++;
        } else if (c != 0) {
            negativeCounter++;
        }
        System.out.println("количество отрицательных чисел: " + negativeCounter);
        System.out.println("количество положительных чисел: " + positiveCounter);
    }
}
