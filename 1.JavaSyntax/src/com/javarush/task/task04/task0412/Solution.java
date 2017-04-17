package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        int t = num.nextInt();
        if (t >0) System.out.println(t*=2);
        if (t==0) System.out.println(0);
        if (t<0) System.out.println(++t);//напишите тут ваш код

    }

}