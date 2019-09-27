package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxValue = Integer.MIN_VALUE;
        int[] arrOfNumb = new int[4];

        for (int i = 0; i < arrOfNumb.length; i++) {
            arrOfNumb[i] = Integer.parseInt(br.readLine());
            if (arrOfNumb[i] > maxValue) {
                maxValue = arrOfNumb[i];
            }
        }

        System.out.println(maxValue);

    }
}
