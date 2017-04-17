package com.javarush.task.task04.task0442;


/* 
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum=0;
        Scanner scn = new Scanner(System.in);
        int t=0;
        while (t!=-1){
            t=scn.nextInt();
            sum+=t;
        }
        System.out.println(sum);

        //напишите тут ваш код
    }
}
