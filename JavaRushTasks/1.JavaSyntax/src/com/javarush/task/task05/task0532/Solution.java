package com.javarush.task.task05.task0532;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sizeOfArray = Integer.parseInt(reader.readLine());
        int[] arrOfNumb = new int[sizeOfArray];

        for (int i = 0; i < arrOfNumb.length; i++) {
            arrOfNumb[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arrOfNumb);
        int maximum = arrOfNumb[arrOfNumb.length - 1];

        System.out.println(maximum);
    }

}
