package com.javarush.task.task15.task1527;

import java.util.LinkedHashMap;
import java.util.Scanner;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14


Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert с параметром double в случае, если значение параметра
obj может быть корректно преобразовано в число типа double.
5. Программа должна вызывать метод alert с параметром String в случае, если значение параметра
obj НЕ может быть корректно преобразовано в число типа double.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String params = s.substring(s.indexOf("?") + 1);
        String[] splitParts = params.split("&");

        //Split every item in splitParts array by "=" and put to Map as key and value
        LinkedHashMap<String, String> paramters = new LinkedHashMap<String, String>();
        for (int i = 0; i < splitParts.length; i++) {
            int posEqualChar = splitParts[i].indexOf("=");
            if (posEqualChar < 0) { //no param, only key exist
                paramters.put(splitParts[i], null);
                continue;
            }
            String key = splitParts[i].substring(0, posEqualChar);
            String value = splitParts[i].substring(posEqualChar + 1);
            paramters.put(key, value);
        }

        //key printing
        for (String key : paramters.keySet()) {
            System.out.print(key + " ");
        }

        //print alert
        System.out.println();
        String objParameter = paramters.get("obj");
        if (objParameter == null) {
            return;
        }

        try {
            alert(Double.parseDouble(objParameter));
        } catch (NumberFormatException e) {
            alert(objParameter);
        }
    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
