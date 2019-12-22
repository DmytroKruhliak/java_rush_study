package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();

        fillArray(arrayList);

        getIndexSmallestOrLongestString(arrayList);
    }

    public static void fillArray(ArrayList<String> arrayList) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 10) {
            try {
                arrayList.add(br.readLine());
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void getIndexSmallestOrLongestString(ArrayList<String> arrayList) {
        int small = arrayList.get(0).length();
        int big = arrayList.get(0).length();

        for (String s : arrayList) {
            if (s.length() > big) big = s.length();
            if (s.length() < small) small = s.length();
        }

        for (String s : arrayList) {
            if (s.length() == small || s.length() == big) {
                System.out.println(s);
                break;
            }
        }
    }
}