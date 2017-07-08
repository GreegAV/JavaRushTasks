package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.


Требования:
1. Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
2. Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.
3. Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.
4. Нельзя изменять классы Zerg, Protoss и Terran.
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg0 = new Zerg();
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Protoss protoss4 = new Protoss();
        Protoss protoss5 = new Protoss();

        Terran terran0 = new Terran();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
