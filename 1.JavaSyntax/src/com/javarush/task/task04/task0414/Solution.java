package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        int year = num.nextInt();
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) System.out.println("количество дней в году: 365");
        else System.out.println("количество дней в году: 366");

        //напишите тут ваш код
    }
}