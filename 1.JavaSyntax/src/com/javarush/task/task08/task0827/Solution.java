package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года —
нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date yearStartDate=new Date();
        Date testDate= new Date(date);

        yearStartDate.setYear(testDate.getYear());
        yearStartDate.setDate(1);      // первое число
        yearStartDate.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        yearStartDate.setHours(0);      // 0 часов
        yearStartDate.setMinutes(0);    // 0 минут
        yearStartDate.setSeconds(0);    // 0 секунд

        long msTimeDistance = testDate.getTime() - yearStartDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        return !(dayCount%2==0);
    }
}
