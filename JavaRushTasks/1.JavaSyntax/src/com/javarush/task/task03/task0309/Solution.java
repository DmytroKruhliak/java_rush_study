package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
1 => 1
2 => 1 + 2 = 3
3 => 1 + 2 + 3 = 6
4 => 1+2+3+4 = 10
5 => 1+2+3+4+5 = 15

*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(sumOfNumbers(i));
        }

    }

    private static int sumOfNumbers(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }

}
