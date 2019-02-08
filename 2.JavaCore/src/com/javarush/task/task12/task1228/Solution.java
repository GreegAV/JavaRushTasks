package com.javarush.task.task12.task1228;

/* 
Интерфейсы к классу Human
Добавь как можно больше интерфейсов к классу Human, но чтобы он не стал абстрактным классом.
Добавлять методы в класс Human запрещается.


Требования:
1. Класс Solution должен содержать интерфейс Worker с методом void workLazy().
2. Класс Solution должен содержать интерфейс Businessman с методом void workHard().
3. Класс Solution должен содержать интерфейс Secretary с методом void workLazy().
4. Класс Solution должен содержать интерфейс Miner с методом void workVeryHard().
5. Класс Solution должен содержать класс Human с методами: void workHard() и void workLazy().
6. Класс Human должен реализовывать три интерфейса.
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Secretary, Businessman, Worker {

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
