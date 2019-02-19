package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        this.instance = instance;
    }

    public static Singleton getInstance() {
        if (instance == null)
            new Singleton();
        return instance;
    }
}