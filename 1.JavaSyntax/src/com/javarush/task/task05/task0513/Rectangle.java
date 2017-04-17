package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Rectangle должны быть переменные top, left, width и height с типом int.
3. У класса должен быть хотя бы один метод initialize.
4. У класса должно быть хотя бы два метода initialize.
5. У класса должно быть хотя бы три метода initialize.
6. У класса должно быть хотя бы четыре метода initialize.
*/

public class Rectangle {
    int top, left, width, height;
    //напишите тут ваш код

public void initialize(int left, int top, int width, int height){
    this.top=top;
    this.height=height;
    this.left=left;
    this.width=width;

}

    public void initialize(int left, int top, int width){
        this.top=top;
        this.height=width;
        this.left=left;
        this.width=width;

    }

    public void initialize(int left, int top){
        this.top=top;
        this.height=0;
        this.left=left;
        this.width=0;

    }

    public void initialize(Rectangle rect){
        this.top=rect.top;
        this.left=rect.left;
        this.width=rect.width;
        this.height=rect.height;

    }

    public static void main(String[] args) {

    }
}
