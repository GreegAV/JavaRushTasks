package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать числа для большого массива с клавиатуры.
3. Программа должна создавать два маленьких массив на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а второю - во второй и вывести его на экран.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] mas20 = new int[20];
        int[] m101=new int[10];
        int[] m102=new int[10];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 20 ; i++) {
            mas20[i]=scn.nextInt();
        }
        for (int i = 0; i <10 ; i++) {
            m101[i]=mas20[i];
            m102[i]=mas20[i+10];
            System.out.println(m102[i]);
        }
    }
}
