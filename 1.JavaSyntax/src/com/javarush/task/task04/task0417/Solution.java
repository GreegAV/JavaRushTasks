package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner tri = new Scanner(System.in);
        int a=tri.nextInt();
        int b=tri.nextInt();
        int c=tri.nextInt();
        if (a==b & b==c) System.out.println(a+" "+a+" "+a);
        else {
            if (a == b) System.out.println(a + " " + a);
            if (a == c) System.out.println(a + " " + a);
            if (c == b) System.out.println(c + " " + c);
        }



        //напишите тут ваш код
    }
}