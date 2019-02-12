package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader file = new BufferedReader(inputStreamReader);

            while (file.ready()) {
                System.out.println(file.readLine());
            }

            file.close();
            inputStreamReader.close();
            fileInputStream.close();
            reader.close();

        } catch (Exception e) {
        }
    }
}