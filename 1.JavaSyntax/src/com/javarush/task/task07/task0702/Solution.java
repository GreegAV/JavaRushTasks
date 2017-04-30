package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.


Требования:
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать строки для массива с клавиатуры.
3. Программа должна выводить 10 строк, каждую с новой строки.
4. Все строки массива (10 элементов) должны быть выведены в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] masstr = new String[10];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i <masstr.length-2 ; i++) {
            masstr[i]=scn.nextLine();
        }


        for (int i = 0; i < masstr.length ; i++) {
            System.out.println(masstr[masstr.length-1-i]);
        }//напишите тут ваш код
    }
}