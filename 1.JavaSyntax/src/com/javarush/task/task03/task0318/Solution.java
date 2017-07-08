package com.javarush.task.task03.task0318;

/* 
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число.
5. Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanAge = new Scanner(System.in);
        Scanner scanname = new Scanner(System.in);
        int sAge = scanAge.nextInt();
        String name = scanname.nextLine();
        System.out.print(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
        //напишите тут ваш код
    }
}
