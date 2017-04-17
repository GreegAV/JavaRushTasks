package com.javarush.task.task05.task0508;

/* 
Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.
*/

public class Person {
    String name;
    int age;
    char sex;

    public void setName(String name) {
        this.name=name;
    }

    String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    int getAge() {
        return age;
    }

    public void setSex (char sex) {
        this.sex = sex;
    }

    char getSex() {
        return sex;
    }




    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
