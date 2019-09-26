package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(br.readLine());
        whatColorIsNow(time);

    }

    private static void whatColorIsNow(double t) {
        double cutedTime = t % 5;
        if ((cutedTime >= 0.0) && (cutedTime < 3.0)) {
            System.out.println("зелёный");
        } else if ((cutedTime >= 3.0) && (cutedTime < 4.0)) {
            System.out.println("жёлтый");
        } else if ((cutedTime >= 4.0) && (cutedTime < 5.0)) {
            System.out.println("красный");
        }
    }
}