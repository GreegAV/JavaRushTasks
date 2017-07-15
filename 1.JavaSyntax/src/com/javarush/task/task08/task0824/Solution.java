package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        //дети
        Human child1 = new Human("child1", true, 2, new ArrayList<>());
        Human child2 = new Human("child2", true, 3, new ArrayList<>());
        Human child3 = new Human("child3", false, 4, new ArrayList<>());

        children.add(child1);
        children.add(child2);
        children.add(child3);

        //родители
        Human mother = new Human("mother", false, 21, children);
        Human father = new Human("father", true, 26, children);

        //родители матери
        ArrayList<Human> chidrenParent1 = new ArrayList<>();
        chidrenParent1.add(mother);
        Human grandMother1 = new Human("grandMother1", false, 55, chidrenParent1);
        Human grandFather1 = new Human("grandFather1", true, 56, chidrenParent1);

        //родители отца
        ArrayList<Human> chidrenParent2 = new ArrayList<>();
        chidrenParent2.add(father);
        Human grandMother2 = new Human("grandMother2", false, 60, chidrenParent2);
        Human grandFather2 = new Human("grandFather2", true, 66, chidrenParent2);

        System.out.println(grandMother1.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(grandFather2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
