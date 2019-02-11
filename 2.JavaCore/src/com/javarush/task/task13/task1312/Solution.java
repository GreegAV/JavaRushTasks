package com.javarush.task.task13.task1312;

/* 
Код сам не исправится
Исправить код так, чтобы программа выполнялась и выводила "Я переводчик с английского".
Метод main менять нельзя!


Требования:
1. Программа должна выводить на экран фразу - "Я переводчик с английского".
2. Метод translate должен возвращать строку - "Я переводчик с английского".
3. Программа должна выполняться без ошибок.
4. Метод main должен выводить на экран результат вызова метода translate у объекта типа Translator.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }


}