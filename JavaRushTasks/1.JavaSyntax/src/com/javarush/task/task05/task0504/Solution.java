package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
       Cat cat1 = new Cat("Baron", 5,7,200);
       Cat cat2 = new Cat("Mojo", 8,10,299);
       Cat cat3 = new Cat("Gobe", 6,8,255);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}