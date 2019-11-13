package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer inputNumb = new Integer(br.readLine());
        getCount(inputNumb);
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static void getCount(int inputNumber) {
        String getLength = String.valueOf(inputNumber);
        int divider = 10;

        while (true) {
            int resByModule = (inputNumber % divider); //divider is increase by order of magnitude every cycle step

            if (resByModule / (divider / 10) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (divider > inputNumber) {
                break;
            }

            divider *= 10;
        }

    }
}
