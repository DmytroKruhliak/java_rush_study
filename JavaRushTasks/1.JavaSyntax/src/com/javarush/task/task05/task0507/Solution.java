package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(getAverage());
    }

    private static double getAverage() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int counter = 0;
        while (true) {
            int i = Integer.parseInt(br.readLine());
            if (i == -1) {
                if (counter == 0) {
                    return 0.0;
                }
                return (double) sum / counter;
            } else {
                counter++;
                sum += i;
            }
        }
    }
}

