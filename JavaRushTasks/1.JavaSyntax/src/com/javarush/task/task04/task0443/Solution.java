package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        System.out.println(showInfo(n, y, m, d));
    }

    private static String showInfo(String name, int year, int month, int day) throws Exception {
        return "Меня зовут " + name + "." + "\n" +
                "Я родился " + day + "." + month + "." + year;
    }
}
