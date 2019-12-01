package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = initArray(new int[20]);
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        for (int i = 0; i < bigArray.length; i++) {
            if (i < 10) {
                smallArr1[i] = bigArray[i];
            } else {
                smallArr2[i - 10] = bigArray[i];
            }
        }

        showDataAtTHeArray(smallArr2);
    }

    private static void showDataAtTHeArray(int[] inArray) {
        for (int i : inArray) {
            System.out.println(i);
        }
    }

    private static int[] initArray(int[] initedArray) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int[] initedArray = new int[numbers];

        for (int i = 0; i < initedArray.length; i++) {
            initedArray[i] = Integer.parseInt(br.readLine());
        }

        return initedArray;
    }
}
