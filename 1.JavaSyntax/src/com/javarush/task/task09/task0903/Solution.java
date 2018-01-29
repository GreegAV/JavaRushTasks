package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        /*напишите тут ваш код*/
        return Thread.currentThread().getStackTrace()[2].getLineNumber();    }

    public static int method2() {
        method3();
        /*напишите тут ваш код*/
        return Thread.currentThread().getStackTrace()[2].getLineNumber();    }

    public static int method3() {
        method4();
        /*напишите тут ваш код*/
        return Thread.currentThread().getStackTrace()[2].getLineNumber();    }

    public static int method4() {
        method5();
        /*напишите тут ваш код*/
        return Thread.currentThread().getStackTrace()[2].getLineNumber();    }

    public static int method5() {
          /*напишите тут ваш код*/
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
