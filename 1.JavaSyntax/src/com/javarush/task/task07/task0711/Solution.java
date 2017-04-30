package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/* 
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и добавлять их в список.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    Scanner scn = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            list.add(i,scn.nextLine());
        }
        for (int i = 0; i < 13 ; i++) {
            list.add(0,list.get(list.size()-1));
            list.remove(list.size()-1);
       }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
