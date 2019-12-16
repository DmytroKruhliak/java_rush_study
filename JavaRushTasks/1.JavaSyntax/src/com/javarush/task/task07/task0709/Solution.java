package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrList = new ArrayList<>();
        init(arrList);


    }

    public static void init(ArrayList<String> arrList) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i != 5) {
            arrList.add(br.readLine());
            i++;
        }
    }

    public static ArrayList<String> getSmallestString(ArrayList<String> arrList) {
        ArrayList<String> shotList = new ArrayList<>();

        for (int i = 0; i < arrList.size(); i++) {
            
        }
    }
}
