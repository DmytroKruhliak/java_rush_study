package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        int year = Integer.parseInt(br.readLine());
        String name = br.readLine();

        System.out.println(getPhrase(year, name));

    }

    private static String getPhrase(int year, String name) {
        String result = null;
        result = name + " захватит мир через " + year + " лет. " + "Му-ха-ха!";
        return result;
    }
}
