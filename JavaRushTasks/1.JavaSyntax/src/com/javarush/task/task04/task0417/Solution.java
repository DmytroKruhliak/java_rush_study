package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    public static void main(String[] args) throws Exception {

        int[] arrayOfNumbers = new int[3];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(br.readLine());
        }

        ifEquals(arrayOfNumbers[0], arrayOfNumbers[1], arrayOfNumbers[2]);
    }

    private static void ifEquals(int a, int b, int c) {

        if ((a == b) && (a == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (c == a) {
            System.out.println(c + " " + a);
        }

    }
}