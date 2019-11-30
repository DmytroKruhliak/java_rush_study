package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrOfNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            arrOfNumbers[i] = Integer.parseInt(br.readLine());
        }

        reverseArray(arrOfNumbers);
    }

    public static void reverseArray(int[] intArr) {
        for (int i = intArr.length-1; i >= 0; i-- ) {
            System.out.println(intArr[i]);
        }
    }
}

