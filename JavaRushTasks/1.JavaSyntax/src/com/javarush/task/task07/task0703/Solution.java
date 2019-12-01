package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        for (int i = 0; i < strArray.length; i++) {
            String s = br.readLine();

            strArray[i] = s;
            intArray[i] = s.length();
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
