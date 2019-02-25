package com.javarush.task.task15.task1511;

import java.io.Serializable;

/* 
Максимально простой код-1
Упрости код - убери все наследования и реализации, которые и так будут добавлены автоматически при компиляции
PS: Взаимосвязь между объектами me и zapp - Has-a (использует): http://ru.wikipedia.org/wiki/Has-a


Требования:
1. Интерфейс SpecificSerializable должен расширять (extends) интерфейс Serializable.
2. Класс JavaDev должен реализовывать интерфейс SepecificSerializable.
3. В коде не должно быть явного наследования от Object (extends Object).
4. Класс JuniorJavaDev не должен явно наследовать интерфейс SpecificSerializable.
*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about com.javarush.task.task15.task1511?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
