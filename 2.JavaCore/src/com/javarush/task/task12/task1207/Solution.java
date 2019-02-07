package com.javarush.task.task12.task1207;

/* 
Int и Integer
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.


Требования:
1. Класс Solution должен содержать статический метод main().
2. Класс Solution должен содержать статический void метод print() с параметром типа int.
3. Класс Solution должен содержать статический void метод print() с параметром типа Integer.
4. Метод main() должен вызывать метод print() с параметром типа int.
5. Метод main() должен вызывать метод print() с параметром типа Integer.
*/

public class Solution {
    public static void main(String[] args) {
        print(5);
        print(Integer.valueOf(5));
    }

    //Напишите тут ваши методы
    static void print(int i) {
    }

    static void print(Integer ii) {
    }
}
