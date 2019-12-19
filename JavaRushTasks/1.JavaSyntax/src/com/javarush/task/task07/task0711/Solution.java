package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();

        fillArrayList(arrayList);

        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    public static void fillArrayList(ArrayList<String> arrayList) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        do {
            arrayList.add(br.readLine());
            i++;
        } while (i < 5);
    }

    public static void shuffle(ArrayList<String> arrayList) {

    }
}
