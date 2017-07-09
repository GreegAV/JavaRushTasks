package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


Требования:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//        Cat catFather = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);
        String dedVasyaName=reader.readLine();
        Cat dedVasya = new Cat(dedVasyaName);

        String babaMurkaName=reader.readLine();
        Cat babaMurka = new Cat(babaMurkaName);

        String papaKotofeyName=reader.readLine();
        Cat papaKotofey = new Cat(papaKotofeyName,null,dedVasyaName);

        String mamaVasilisaName=reader.readLine();
        Cat mamaVasilisa = new Cat(mamaVasilisaName,babaMurkaName,null);

        String sonMurchikName=reader.readLine();
        Cat sonMurchik = new Cat(sonMurchikName,mamaVasilisaName,papaKotofeyName);

        String daughterPushinkaName=reader.readLine();
        Cat daughterPushinka = new Cat(daughterPushinkaName,mamaVasilisaName,papaKotofeyName);

        System.out.println(dedVasya.toString());
        System.out.println(babaMurka.toString());
        System.out.println(papaKotofey.toString());
        System.out.println(mamaVasilisa.toString());
        System.out.println(sonMurchik.toString());
        System.out.println(daughterPushinka.toString());
    }

    public static class Cat {
        private String name;
        private String mother;
        private String father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, String mother, String father) {
            this.name = name;
            this.mother=mother;
            this.father=father;
        }


        @Override
        public String toString() {
            if ((mother == null)&& (father==null)) {
                return "Cat name is " + name + ", no mother, no father ";
            }
            if ( mother==null) {
                return "Cat name is " + name + ", no mother, father is " + father;
            }
            if ( father==null) {
                return "Cat name is " + name + ", mother is " + mother + ", no father";
                }
            return "Cat name is " + name + ", mother is " + mother + ", father is " + father;
            }
    }

}
