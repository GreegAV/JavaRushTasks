package com.javarush.task.task04.task0443;


/* 
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
«Меня зовут name.
Я родился d.m.y»
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int y = scn.nextInt();
    int m = scn.nextInt();
    int d = scn.nextInt();

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);
        //напишите тут ваш код
    }
}
