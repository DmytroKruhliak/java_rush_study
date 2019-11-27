package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> listOfInputtedNumbers = new ArrayList<>();

        do {
            listOfInputtedNumbers.add(Integer.parseInt(reader.readLine()));
        } while (listOfInputtedNumbers.size() != 5);

        myOwnSortedAlgorithm(listOfInputtedNumbers);
    }

    public static void myOwnSortedAlgorithm(List<Integer> list) { // new int {3,2,15,6,17};

        int index = 0;
        int stepper = 0;
        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

            }
        }
        for (int t : list) {
            System.out.println(t);
        }
    }
}
