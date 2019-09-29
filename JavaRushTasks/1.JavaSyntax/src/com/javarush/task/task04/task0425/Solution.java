package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(whatPart(a, b));
    }

    private static int whatPart(int a, int b) {
        if (a > 0 && b > 0) return 1;
        if (a < 0 && b > 0) return 2;
        if (a < 0 && b < 0) return 3;
        return 4;
    }
}
