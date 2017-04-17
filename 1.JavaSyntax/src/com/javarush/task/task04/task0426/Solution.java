package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if (n>0 && n%2==0) System.out.println("положительное четное число");
        if (n<0 && n%2==0) System.out.println("отрицательное четное число");
        if (n<0 && n%2!=0) System.out.println("отрицательное нечетное число");
        if (n>0 && n%2!=0) System.out.println("положительное нечетное число");
        if (n==0) System.out.println("ноль");


    }
}
