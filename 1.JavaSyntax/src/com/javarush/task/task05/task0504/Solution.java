package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1", 1,1,1);//напишите тут ваш код
        Cat cat2 = new Cat("Cat2", 2,2,2);//напишите тут ваш код
        Cat cat3 = new Cat("Cat3", 3,3,3);//напишите тут ваш код
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