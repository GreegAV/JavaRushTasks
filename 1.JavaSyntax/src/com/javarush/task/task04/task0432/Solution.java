package com.javarush.task.task04.task0432;



/* 
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String ss = scn.nextLine();
        int a = scn.nextInt();
        while (a>0){
            System.out.println(ss);
            a--;
        }




        //напишите тут ваш код

    }
}
