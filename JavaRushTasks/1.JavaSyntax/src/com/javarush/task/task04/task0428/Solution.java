package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = howMachPositiveNumbers(Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()),
                Integer.parseInt(br.readLine()));
        System.out.println(res);
    }

    private static int howMachPositiveNumbers(int a, int b, int c) {
        int result = 0;
        if (a > 0) result = result + 1;
        if (b > 0) result = result + 1;
        if (c > 0) result = result + 1;
        return result;
    }
}
