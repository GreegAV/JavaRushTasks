package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
Если имена и длины имен разные — ничего не выводить.


Требования:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        String n2 = scanner.nextLine();
        if (n1.equalsIgnoreCase(n2))
        {
            System.out.println("Имена идентичны");
        } else if (n1.length()==n2.length()) {
            System.out.println("Длины имен равны");
        }

    }
}
