package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a!=b&&a!=c&&c==b){

            System.out.println(1);
        }else if(b!=c&&b!=a&&c==a){

            System.out.println(2);
        }else if(c!=a&&c!=b&&a==b){

            System.out.println(3);
        }
    }
}
