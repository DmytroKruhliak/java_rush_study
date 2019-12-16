package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrList = new ArrayList<>();
        init(arrList);

        for (String s : getSmallestStrings(arrList)) System.out.println(s);


    }

    public static void init(ArrayList<String> arrList) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i != 5) {
            arrList.add(br.readLine());
            i++;
        }
    }

    public static ArrayList<String> getSmallestStrings(ArrayList<String> arrList) {
        ArrayList<String> shotList = new ArrayList<>();

        for (int i = 0; i < arrList.size(); i++) {
            int pivot = getPivot(arrList);
            String currentStr = arrList.get(i);
            if (currentStr.length() == pivot) {
                shotList.add(currentStr);
            }
        }
        return shotList;
    }

    public static int getPivot(ArrayList<String> arrList) {
        int result = Integer.MAX_VALUE;
        for (String s : arrList) {
            if (s.length() < result) result = s.length();
        }
        return result;
    }
}
