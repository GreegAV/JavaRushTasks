package com.javarush.task.task09.task0923;

import java.util.Scanner;

/* 
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить две строки.
3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5. Каждая строка должна заканчиваться пробелом.
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder outVowels = new StringBuilder();
        StringBuilder outOther = new StringBuilder();
        for (char chr : input.toCharArray()) {
            if (!Character.isSpaceChar(chr)) {
                if (isVowel(chr)) {
                    outVowels.append(chr);
                    outVowels.append(" ");
                } else {
                    outOther.append(chr);
                    outOther.append(" ");
                }
            }
        }
        System.out.println(outVowels);
        System.out.println(outOther);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
}