package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> strList = new LinkedList<>();

        while (strList.size() != 10)
            strList.add(0, br.readLine());

        for (String s : strList) {
            System.out.println(s);
        }
    }
}
