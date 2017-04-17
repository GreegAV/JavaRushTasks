package com.javarush.task.task05.task0512;

/* 
Создать класс (Circle) круг, с тремя инициализаторами:
— centerX, centerY, radius
— centerX, centerY, radius, width
— centerX, centerY, radius, width, color
Создать класс Circle
*/

public class Circle {
    int centerX,centerY,radius,width,color;

    public void initialize(int x, int y, int r){
        this.centerX=x;
        this.centerY=y;
        this.radius=r;
    }

    public void initialize(int x, int y, int r, int w){
        this.centerX=x;
        this.centerY=y;
        this.radius=r;
        this.width=w;
    }

    public void initialize(int x, int y, int r, int w, int c){
        this.centerX=x;
        this.centerY=y;
        this.radius=r;
        this.width=w;
        this.color=c;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
