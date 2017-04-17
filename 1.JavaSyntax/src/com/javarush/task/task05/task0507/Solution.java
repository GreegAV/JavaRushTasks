package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num=0, count=0;
        double sum =0.0;

        while (num!=-1) {
            num=scn.nextInt();
            if (num!=-1) {
                sum+=num;
                count++;
            }
        }

        System.out.println(sum/count);

        //напишите тут ваш код
    }
}

