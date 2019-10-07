package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {

        getEven(1,100);

    }

    private static void getEven(int from, int to) {
        for (; from <= to; from++) {
            if ((from % 2) == 0)
            System.out.println(from);
        }
    }
}
