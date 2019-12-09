package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        strings = new ArrayList<>(5);

        initArrayList(strings); //this method returns filled ArrayList by BufferedReader

        showLongestStrings(strings);


    }

    public static void initArrayList(List<String> list) throws Exception { // fil the ArrayLIst
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (5 > i) {
            list.add(br.readLine());
            i++;
        }
    }

    public static void showLongestStrings(ArrayList<String> list) {
        int pivotLength = getLongestString(list);

        for (int i = 0; i < list.size(); i++) {
            String sTemp = list.get(i); // temporary container for String from the list

            if (pivotLength == sTemp.length()) {
                System.out.println(sTemp);
            }



        }
    }


    public static int getLongestString(ArrayList<String> list) { //this method returns count of characters of the longest String in Array
        int sLengthTemp = 0;

        for (int i = 0; i < list.size(); i++) {
            String sTemp = list.get(i);

            if (sTemp.length() > sLengthTemp) {
                sLengthTemp = sTemp.length();
            }
        }

        return sLengthTemp;
    }
}
