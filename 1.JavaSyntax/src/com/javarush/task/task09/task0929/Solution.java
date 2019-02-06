package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует,
то программа должна вывести надпись "Файл не существует." и еще один раз прочитать имя файла с консоли,
а уже потом считывать файл для записи.


Требования:
1. Программа должна считывать имена файлов.
2. Метод main должен обрабатывать исключения кидаемые методом getInputStream.
Если возникло исключение, нужно вывести сообщение «Файл не существует.».
3. Программа должна копировать содержимое первого файла во второй.
4. В методе main должен вызываться метод getInputStream.
5. Метод getInputStream изменять нельзя.
6. В методе main должен вызывать метод getOutputStream.
7. Метод getOutputStream изменять нельзя.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream fileInputStream = null;
        for (int i = 0; i < 1; i++) {
            try {
                fileInputStream = getInputStream(reader.readLine());
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
                fileInputStream = getInputStream(reader.readLine());
            }
        }
        OutputStream fileOutputStream = getOutputStream(reader.readLine());

        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
        }

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