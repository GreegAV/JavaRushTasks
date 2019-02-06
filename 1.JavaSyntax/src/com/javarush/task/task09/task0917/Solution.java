package com.javarush.task.task09.task0917;

/* 
Перехват unchecked-исключений
В методе handleExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch


Требования:
1. Метод handleExceptions должен вызывать метод method1.
2. Метод handleExceptions должен вызывать метод method2.
3. Метод handleExceptions должен вызывать метод method3.
4. Метод handleExceptions должен использовать только один блок try..catch.
5. Метод handleExceptions должен отлавливать все unchecked исключения и выводить стек-трейс каждого из них,
используя метод printStack.
6. Метод handleExceptions не должен отлавливать checked исключения
7. Программа должна выводить на экран текст.
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RuntimeException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

