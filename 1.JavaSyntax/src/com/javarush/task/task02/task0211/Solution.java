package com.javarush.task.task02.task0211;

/* 
Самое нужное число
Закомментируй максимальное количество строк, чтобы на экран вывелось число 19


Требования:
1. Программа должна выводить на экран число 19.
2. Нельзя изменять строки с объявлением переменных.
3. Нельзя изменять строку отвечающую за вывод в консоль.
4. Нужно закомментировать необходимые строки и не менять остальные.
*/
public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + x;

        x = x * 2;
        y = y + x;

        x = x * 2;
     //   y = y + x;

        x = x * 2;
     //   y = y + x;

        x = x * 2;
        y = y + x;

        System.out.println(y);
    }
}
