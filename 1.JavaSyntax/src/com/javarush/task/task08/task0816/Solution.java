package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1982"));
        map.put("Stallone3", new Date("AUGUST 1 1983"));
        map.put("Stallone4", new Date("JUNE 15 1984"));
        map.put("Stallone5", new Date("MARCH 1 1985"));
        map.put("Stallone6", new Date("MAY 1 1984"));
        map.put("Stallone7", new Date("DECEMBER 1 1983"));
        map.put("Stallone8", new Date("JANUARY 1 1982"));
        map.put("Stallone9", new Date("APRIL 1 1981"));
        map.put("Stallone10", new Date("SEPTEMBER 1 1980"));

        return (map);//напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> now = iterator.next();
            if (now.getValue().getMonth() < 8 && now.getValue().getMonth()  > 4) {
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
    }
}


