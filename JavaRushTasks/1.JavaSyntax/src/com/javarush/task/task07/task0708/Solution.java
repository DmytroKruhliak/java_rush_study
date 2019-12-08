package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш
        ArrayList<String> arrayList = new ArrayList<>();
        initArrayList(arrayList);


        System.out.println(Arrays.toString(arrayList.toArray()));

    }

    public static void initArrayList(List<String> list) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while(5 > i) {
            list.add(br.readLine());
            i++;
        }
    }
}
