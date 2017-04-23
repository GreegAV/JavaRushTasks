package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку «true» или «false» и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.


Требования:
1. Метод readString должен считывать и возвращать строку(тип String).
2. Метод readInt должен считывать и возвращать число(тип int).
3. Метод readDouble должен считывать и возвращать дробное число(тип double).
4. Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();

        //напишите тут ваш код

    }

    public static int readInt() throws Exception {
        Scanner scn2 = new Scanner(System.in);
        return scn2.nextInt();
        //напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        Scanner scn3 = new Scanner(System.in);
        return scn3.nextDouble();//напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        Scanner scn4 = new Scanner(System.in);
        return scn4.nextBoolean();//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
