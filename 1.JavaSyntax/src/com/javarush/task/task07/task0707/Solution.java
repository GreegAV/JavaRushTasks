package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


Требования:
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список. Строки придумай сам.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        int n = list.size();
        System.out.println(n);
        for (int i = 0; i < n; i++)
        {
            System.out.println( list.get(i) );
        }
    }
}
