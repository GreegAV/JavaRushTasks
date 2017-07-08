package com.javarush.task.task03.task0324;

/* 
Меркантильные намерения
Вывести на экран десять раз надпись «Я хочу большую зарплату, и для этого изучаю Java»


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Программа должна выводить текст.
3. Текст должен начинаться с "Я хочу".
4. Текст должен заканчиваться на "изучаю Java".
5. Текст должен состоять из 10 строк.
6. Выводимый текст должен соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я хочу большую зарплату, и для этого изучаю Java";
        System.out.println(s);System.out.println(s);
        System.out.println(s);System.out.println(s);
        System.out.println(s);System.out.println(s);
        System.out.println(s);System.out.println(s);
        System.out.println(s);System.out.println(s);
        //опять жесткий читинг. Можно было тупо циклом.
    }
}
