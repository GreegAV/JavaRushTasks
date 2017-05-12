package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(reader.readLine());
        int M=Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++)
            list.add(reader.readLine());
        for (int i = 0; i < M; i++){
            list.add(list.get(0));
            list.remove(0);
        }
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}