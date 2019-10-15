package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name;
    int height;
    String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.height = age;
    }

    public void initialize(String name, int age, String color) {
        this.name = name;
        this.height = age;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
