package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().


Требования:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
4. Для получения номера строки, используй метод getLineNumber класса StackTraceElement.
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
