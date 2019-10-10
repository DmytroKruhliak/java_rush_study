package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        getSum();
    }

    private static void getSum() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int enteredNum = 0;
        int sum = 0;
        do {
            enteredNum = Integer.parseInt(br.readLine());
            sum += enteredNum;
        }while(enteredNum != -1);
        System.out.println(sum);
    }
}
