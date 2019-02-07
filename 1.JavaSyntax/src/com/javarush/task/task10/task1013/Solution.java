package com.javarush.task.task10.task1013;

import java.util.ArrayList;
/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private long inn;
        private ArrayList<Human> children;

        public Human(String firstName, String lastName, boolean sex, ArrayList<Human> children) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.children = children;
        }

        public Human(String firstName, String lastName, int age, long inn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.inn = inn;
        }

        public Human(String firstName, String lastName, boolean sex, long inn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.inn = inn;
        }

        public Human() {
        }

        public Human(String firstName, String lastName, int age, boolean sex, long inn, ArrayList<Human> children) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.inn = inn;
            this.children = children;
        }

        public Human(String firstName, String lastName, int age, boolean sex, long inn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.inn = inn;
        }

        public Human(String firstName, String lastName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }
    }
}
