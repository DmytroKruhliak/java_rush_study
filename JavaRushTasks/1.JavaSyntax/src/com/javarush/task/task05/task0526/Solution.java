package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man man1 = new Man("Jora", 30, "Earth");
        Man man2 = new Man("Rusya", 25, "Kharkiv");
        System.out.println(man1.toString());
        System.out.println(man2.toString());

        Woman woman1 = new Woman("Allya", 24, "Dreams");
        Woman woman2 = new Woman("Lara", 28, "Family English School");
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name) {
            this.name = name;
        }

        public Man(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public Man(int age) {
            this.age = age;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }


    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;

        }


        public String toString() {
            return name + " " + age + " " + address;
        }
    }

}

