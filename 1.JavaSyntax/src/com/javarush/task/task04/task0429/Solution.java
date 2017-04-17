package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d=0, e=0;
        if (a>0) d++; else if (a<0) e++;
        if (b>0) d++; else if (b<0) e++;
        if (c>0) d++; else if (c<0) e++;
        System.out.println("количество положительных чисел: "+d);
        System.out.println("количество отрицательных чисел: "+e);

    }
}
