package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

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
