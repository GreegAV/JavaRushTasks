package com.javarush.task.task12.task1205;

/* 
Определимся с животным
Написать метод, который определяет,
объект какого класса ему передали, и возвращает результат - одно значение из:
"Корова", "Кит", "Собака", "Неизвестное животное".


Требования:
1. Программа должна выводить текст на экран.
2. В классе Solution должен быть статический класс Cow.
3. В классе Solution должен быть статический класс Dog.
4. В классе Solution должен быть статический класс Whale.
5. В классе Solution должен быть статический класс Pig.
6. Метод getObjectType() должен возвращать одно значение из:
"Корова", "Кит", "Собака", "Неизвестное животное" в зависимости от переданного объекта.
Например "Корова" для объектов типа Solution.Cow.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String type = o.getClass().getSimpleName();
        type = type.equalsIgnoreCase("whale") ? "Кит" :
                type.equalsIgnoreCase("cow") ? "Корова" :
                        type.equalsIgnoreCase("dog") ? "Собака" : "Неизвестное животное";
        return type;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
