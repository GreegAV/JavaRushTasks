package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strWitchNumber1 = bufferedReader.readLine();
        String strWitchNumber2 = bufferedReader.readLine();
        int number1Count = Integer.parseInt(strWitchNumber1);
        int number2Count = Integer.parseInt(strWitchNumber2);
        String strPeopleName = bufferedReader.readLine();
        System.out.println(strPeopleName + "получает" + number1Count + "через" + number2Count + "лет");
        //напишите тут ваш код
    }
}
