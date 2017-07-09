package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine()) ;
        if (n>0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < n; i++) {
                int tmp = Integer.parseInt(reader.readLine());
                if ( tmp > maximum ) {
                    maximum = tmp;
                }
            }
            System.out.println(maximum);
        }
    }
}
