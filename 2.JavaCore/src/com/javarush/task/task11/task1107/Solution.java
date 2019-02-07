package com.javarush.task.task11.task1107;

/* 
Наш кот слишком публичен!
Скрыть внутренние переменные класса Cat, к которым есть доступ с помощью методов.


Требования:
1. Переменная name класса Cat должна быть скрыта.
2. Переменная age класса Cat должна быть скрыта.
3. Переменная weight класса Cat должна быть открыта.
4. В классе Cat должны быть 3 переменные.
5. В Cat должны быть private и public переменные.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}