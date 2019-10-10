package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(getMid(a,b,c));

    }

    private static int getMid(int a, int b, int c) {

        int max = Math.max((Math.max(a, b)), c);
        int min = Math.min((Math.min(a, b)), c);
        int sum = a + b + c;

        return sum - max - min;
    }
}
