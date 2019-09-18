package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int inputNumber = Integer.parseInt(br.readLine());

            isPositive(inputNumber);

            if (inputNumber == 999) return;
        }
    }

    public static void isPositive(int a) {
        if (a < 0) {
            System.out.println(++a);
        } else if (a > 0) {
            System.out.println(a * 2);
        } else {
            System.out.println(a);
        }
    }
}