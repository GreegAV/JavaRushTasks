package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double t = Double.parseDouble(reader.readLine());
        int n = (int)(t/5);
        t = t - 5*n;
        String s = "зелёный";
        if (t>3) s ="желтый";
        if (t>4) s ="красный";
        System.out.println(s);
    }
}