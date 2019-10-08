package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getSomeLove(br.readLine());

    }

    private static void getSomeLove(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
