package com.javarush.task.task12.task1223;

/* 
И снова Пушистик…
Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.


Требования:
1. Класс Solution должен содержать класс Pet.
2. Класс Solution должен содержать класс Cat.
3. Класс Cat должен наследоваться от класса Pet.
4. Класс Pet должен содержать два метода getName() и setName().
5. Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.
6. Программа должна выводить на экран результат метода getName() объекта pet.
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            this.name="";
        }
    }
}
