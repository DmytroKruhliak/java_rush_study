package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < list.size() - 1; ) {
            if (list.get(i).length() < list.get(i + 1).length()) {
                i++;
            } else {
                System.out.println(i+1);
                break;
            }
        }
    }
}

