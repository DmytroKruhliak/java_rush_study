package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(br.read());

        getMultipleTable(10);

    }

    private static void getMultipleTable(int rate) {

        for (int i = 1; i <= rate; i++){
            for (int j = 1; j <= rate; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}
