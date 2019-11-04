package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(03 + " " + 11 + " " + 2019);
        getDate();
    }

    public static void getDate(){
        Date  date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
