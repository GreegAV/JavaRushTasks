package com.javarush.task.task09.task0928;

import java.io.*;

/* 
Код не компилится…
Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.


Требования:
1. Программа должна считывать имена файлов.
2. Метод getInputStream изменять нельзя.
3. Метод getOutputStream изменять нельзя.
4. Программа должна копировать содержимое первого файла во второй.
5. Программа должна выводить количество скопированных байт.
6. Метод main должен вызывать метод getInputStream.
7. Метод main должен вызывать метод getOutputStream.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);
        int count = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }
        System.out.println("Скопировано байт " + count);
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
