package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> divByThree = new ArrayList<>();
        ArrayList<Integer> divByTwo = new ArrayList<>();
        ArrayList<Integer> divByAnother = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for (Integer i : list) {
            if (i % 3 == 0) {
                if (i % 2 == 0) {
                    divByThree.add(i);
                    divByTwo.add(i);
                } else {
                    divByThree.add(i);
                }
            } else if (i % 2 == 0) {
                divByTwo.add(i);
            } else {
                divByAnother.add(i);
            }
        }

        printList(divByThree);
        printList(divByTwo);
        printList(divByAnother);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
