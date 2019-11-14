package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {

        double cathetusX = Math.abs(x1 - x2);
        double cathetusY = Math.abs(y1 - y2);
        double hypotenuseSqr = cathetusX * cathetusX + cathetusY * cathetusY;

        return Math.sqrt(hypotenuseSqr);
    }

    public static void main(String[] args) {

    }
}
