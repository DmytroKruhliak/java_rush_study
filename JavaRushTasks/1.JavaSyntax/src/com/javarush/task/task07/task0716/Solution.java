package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        int i = 0;
        for (String s : strings) {
            if (containsL(s) && containsR(s)) {
                i++;
            } else if (containsR(s)) {
                strings.remove(s);
            } else if (containsL(s)){
                strings.add(s);
            }
        }
        return strings;
    }

    public static boolean containsR(String s) {
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

    public static boolean containsL(String s) {
        char[] charsArr = s.toCharArray();
        boolean result = true;
        for (char c : charsArr) {
            if (c == 'л') {
                result = true;
                break;
            }
        }
        return result;
    }

}