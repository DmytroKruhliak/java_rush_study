package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int cat1 = 0;
        int cat2 = 0;

        if (age > anotherCat.age) {
            cat1++;
        } else if (age < anotherCat.age) {
            cat2++;
        }

        if (weight > anotherCat.weight) {
            cat1++;
        } else if (weight < anotherCat.weight) {
            cat2++;
        }
        if (strength > anotherCat.strength) {
            cat1++;
        } else if (strength < anotherCat.strength) {
            cat2++;
        }

        if (cat1 == cat2) {
            return false;
        } else if (cat1 > cat2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.weight = 1;
        cat1.strength = 9;

        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.weight = 1;
        cat2.strength = 1;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
