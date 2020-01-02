package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("роза");// 0
        strings.add("лоза");// 1
        strings.add("лира");// 2

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        for (String s : strings ) {
            if (containsL(s) && containsR(s)) {
                list.add(s);
            } else if (containsL(s)){
                list.add(s);
                list.add(s);
            } else if (!containsR(s)) {
                list.add(s);
            }
        }

        return list;
    }

    public static boolean containsR(String s) { // delete
        char[] charsArr = s.toCharArray();
        boolean result = false;
        for (char c : charsArr) {
            if (c == 'р') {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean containsL(String s) { //double
        char[] charsArr = s.toCharArray();
        boolean result = false;
        for (char c : charsArr) {
            if (c == 'л') {
                result = true;
                break;
            }
        }
        return result;
    }

}