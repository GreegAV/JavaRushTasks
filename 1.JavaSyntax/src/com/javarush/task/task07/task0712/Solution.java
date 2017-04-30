package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int numshort=0, numlong=0, minlenght=0, maxlenght=0;
        list.add(0, scn.nextLine());
        minlenght=list.get(0).length();
        maxlenght=list.get(0).length();
       for (int i = 1; i <10 ; i++) {
            list.add(i, scn.nextLine());
            if (minlenght>list.get(i).length()){
                numshort=i;
                minlenght=list.get(i).length();
            }
           if (maxlenght<list.get(i).length()){
               numlong=i;
               maxlenght=list.get(i).length();
           }
        }
        if (numlong>numshort) System.out.println(list.get(numshort));
            else System.out.println(list.get(numlong));
    }
}
