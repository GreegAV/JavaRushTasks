package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner tri = new Scanner(System.in);
        int a = tri.nextInt();
        int b = tri.nextInt();
        int c = tri.nextInt();
        if (  a+b>c ^ a+c>b ^ a<b+c ) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

        //напишите тут ваш код
    }
}