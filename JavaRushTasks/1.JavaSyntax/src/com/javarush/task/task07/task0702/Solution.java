package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array = arrInit();
        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i-1]);
        }

    }

    public static String[] arrInit() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] initedArray = new String[10];

        for (int i = 0; i < initedArray.length-2; i++) {
            initedArray[i] = br.readLine();
        }

        return initedArray;
    }
}