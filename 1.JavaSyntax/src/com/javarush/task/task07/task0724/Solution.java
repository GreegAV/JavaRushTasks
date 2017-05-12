package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>();
        Human father1 = new Human("M", true, 21);
        Human mother1 = new Human("F", false, 21);
        Human father2 = new Human("M1", true, 21);
        Human mother2 = new Human("F1", false, 21);
        Human father3 = new Human("M3", true, 21, father1, mother1);
        Human mother3 = new Human("F3", false, 21, father2, mother2);
        Human child1 = new Human("Kate", false, 21, father3, mother3);
        Human child2 = new Human("Pol", true, 2, father3, mother3);
        Human child3 = new Human("Kol", true, 1, father3, mother3);
        list.add(father1);
        list.add(mother1);
        list.add(father2);
        list.add(mother2);
        list.add(father3);
        list.add(mother3);
        list.add(child1);
        list.add(child2);
        list.add(child3);
        for (Human aList : list) {
            System.out.println(aList);
        }
    }

    public static class Human {
        protected String name;
        protected boolean sex;
        protected int age;
        protected Human father;
        protected Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean s, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















