package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int count = Integer.parseInt(br.readLine());

        getMultipleString(str, count);
    }

    private static void getMultipleString(String s, int count) {
        while (count > 0) {
            System.out.println(s);
            count--;
        }
    }
}
