package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Math.min(
                Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()),
                Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

}