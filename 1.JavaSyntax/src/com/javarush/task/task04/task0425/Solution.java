package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import  java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner xy = new Scanner(System.in);
        int x = xy.nextInt();
        int y = xy.nextInt();
        if (x>0)
            if (y>0) System.out.println(1);
        else System.out.println(4);
        else if (y>0) System.out.println(2);
        else System.out.println(3);
        //напишите тут ваш код
    }
}
