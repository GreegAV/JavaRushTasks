package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader file = new BufferedReader(inputStreamReader);
            ArrayList<Integer> arrayList = new ArrayList();
            while (file.ready()) {
                int num = Integer.parseInt(file.readLine());
                if (num % 2 == 0)
                    arrayList.add(num);
            }
            file.close();
            inputStreamReader.close();
            fileInputStream.close();
            reader.close();

            int[] ints = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                ints[i] = arrayList.get(i);
            }
            Arrays.sort(ints);
            for (int tmp : ints) {
                System.out.println(tmp);
            }
        } catch (Exception e) {
        }
    }
}