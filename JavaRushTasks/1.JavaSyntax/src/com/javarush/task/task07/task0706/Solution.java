package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] addresses = new int[15];

        initArray(addresses);

        System.out.println(getCount(addresses));

    }

    public static void initArray(int[] array) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
    }

    public static String getCount(int[] arr) {
        int evenPeople = 0;
        int oddPeople = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenPeople += arr[i];
            } else {
                oddPeople += arr[i];
            }
        }

        return (evenPeople < oddPeople) ? "В домах с нечетными номерами проживает больше жителей."
                : "В домах с четными номерами проживает больше жителей.";
    }
}
