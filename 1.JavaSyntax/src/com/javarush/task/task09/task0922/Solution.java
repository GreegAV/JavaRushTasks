package com.javarush.task.task09.task0922;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Программа должна выводить данные на экран.
5. Вывод должен соответствовать заданию.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat mdy = new SimpleDateFormat("MMM dd, yyyy");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Date date = ymd.parse(s);
        System.out.println(mdy.format(date).toUpperCase());
    }
}
