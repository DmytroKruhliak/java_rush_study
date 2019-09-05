package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {

        Zerg zerg1 = new Zerg();
        zerg1.name = "Drone";
        new Zerg().name = "Hydralisk";
        new Zerg().name = "Mytalisk";
        new Zerg().name = "Zergling";
        new Zerg().name = "Mutalisk";

        new Protoss().name = "Probe";
        new Protoss().name = "Zealot";
        new Protoss().name = "Dragoon";

        new Terran().name = "Worker";
        new Terran().name = "Marine";
        new Terran().name = "Fireman";
        new Terran().name = "Reaper";


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
