package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.


Требования:
1. Программа должна считывать 20 целых чисел с клавиатуры.
2. Программа должна выводить 20 чисел.
3. Метод main должен вызывать метод sort.
4. Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        for (int i = 0, j = array.length - 1; i < j; i++, j--)
        {
            int t = array[i];
            array[i] = array[j];
            array[j] = t;
        }
        //напишите тут ваш код
    }
}
