package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;
    //напишите тут ваш код

    public Rectangle(int left, int top, int width, int height){
        this.top=top;
        this.height=height;
        this.left=left;
        this.width=width;

    }

    public Rectangle(int left, int top, int width){
        this.top=top;
        this.height=width;
        this.left=left;
        this.width=width;

    }

    public Rectangle(int left, int top){
        this.top=top;
        this.height=0;
        this.left=left;
        this.width=0;

    }

    public Rectangle(Rectangle rect){
        this.top=rect.top;
        this.left=rect.left;
        this.width=rect.width;
        this.height=rect.height;

    }

    public static void main(String[] args) {

    }
}

