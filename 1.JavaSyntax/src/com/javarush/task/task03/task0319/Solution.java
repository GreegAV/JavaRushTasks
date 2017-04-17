package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name="", money="", time="";
        Scanner scn = new Scanner(System.in);
        name = scn.nextLine();
        money = scn.nextLine();
        time = scn.nextLine();
        System.out.println(name + " получает " + money + " через " + time +" лет.");//напишите тут ваш код
    }
}
