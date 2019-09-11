package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(getName() + "+ "
                + getName() + "+ "
                + getName()
                + "= Чистая любовь, да-да!");

    }

    private static String getName() throws IOException {

        Reader reader = new InputStreamReader(System.in);
        BufferedReader buffReader = new BufferedReader(reader);

        return buffReader.readLine() + " ";

    }
}