package com.javarush.task.task04.task0428;

/* 
Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d=0;
        if (a>0) d++;
        if (b>0) d++;
        if (c>0) d++;
        System.out.println(d);

        //напишите тут ваш код

    }
}
