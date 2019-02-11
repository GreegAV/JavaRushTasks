package com.javarush.task.task13.task1302;

/* 
Пиво-2. Возвращение
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.


Требования:
1. Класс AlcoholicBeer должен реализовывать(implements) интерфейс Drink.
2. В классе AlcoholicBeer должны быть реализованы все методы интерфейса Drink.
3. В классе AlcoholicBeer должно содержаться только два метода.
4. Метод isAlcoholic должен возвращать true, т.к. пиво содержит алкоголь.
5. Программа должна выводить на экран тип напитка в зависимости от того что возвращает метод isAlcoholic.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public boolean isAlcoholic() {
            return true;
        }

        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

    }
}