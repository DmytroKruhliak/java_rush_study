package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> listStr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            listStr.add(br.readLine());
        }

        listStr.remove(2);

        for (int i = listStr.size()-1; i >= 0; i--) {
            System.out.println(listStr.get(i));
        }

    }
}
