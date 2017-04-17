package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1",1,1,1);//напишите тут ваш код
        Cat cat2 = new Cat("Cat2",2,2,2);//напишите тут ваш код
        Cat cat3 = new Cat("Cat3",3,3,3);//напишите тут ваш код

        if (cat1.fight(cat2)) System.out.println("Winner cat1"); else System.out.println("Winner cat2");
        if (cat2.fight(cat3)) System.out.println("Winner cat2"); else System.out.println("Winner cat3");
        if (cat3.fight(cat1)) System.out.println("Winner cat3"); else System.out.println("Winner cat1");

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
