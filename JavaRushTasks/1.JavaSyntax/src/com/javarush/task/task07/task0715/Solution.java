package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        exactlyAfter(list, "мама");
        exactlyAfter(list, "мыла");
        exactlyAfter(list, "раму");

        printList(list);
    }

    public static void exactlyAfter(ArrayList<String> list, String s) {
        list.add(s);
        list.add("именно");
    }

    public static void printList(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }

    }
}
