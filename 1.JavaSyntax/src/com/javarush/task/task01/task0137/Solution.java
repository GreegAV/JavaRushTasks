package com.javarush.task.task01.task0137;

/* 
Подойдет только 20
В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
Знаки нужно расставить только в строчке, в которой объявляется переменная result.
Перед каждой переменной должен стоять знак либо плюс, либо минус.


Требования:
1. Значения переменных: a, b, c, d не изменяй.
2. Перед каждой из переменных: a, b, c, d в строке с объявлением переменной result
должен стоять один знак плюс либо минус.
3. В результате работы программы на экран нужно вывести число 20.
4. Знаки плюс и минус должны быть расставлены правильно.
*/

public class Solution {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

     //   int result = + a + b + c + d;
        int result = - a + b - c + d;

        System.out.println(result);
    }
}