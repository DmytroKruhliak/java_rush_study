package com.javarush.task.task04.task0434;
public class Solution {
    public static void main(String[] args) {
        int a = 1, b = 1;
        while (a <= 10) {
            while (b <= 10) {
                System.out.print((a * b++) + " ");
            }
            System.out.println();
            a++;
            b = 1;
        }
    }
}
