package com.javarush.task.task04.task0422;

/* 
18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».


Требования:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст меньше 18 вывести сообщение "Подрасти еще".
4. Если возраст больше либо равно 18 ничего не выводить.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age=scanner.nextInt();

        if (age<18 && age>0) {
            System.out.println("Подрасти еще");
        }
        //напишите тут ваш код
    }
}
