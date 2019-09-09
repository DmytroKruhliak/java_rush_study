package com.javarush.task.task03.task0320;

/* 
Скромность украшает программиста
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = bufferedReader.readLine();

        System.out.println(modesty(s));

    }

    public static String modesty(String s) {
        return s + " зарабатывает $5,000. Ха-ха-ха!";
    }
}
