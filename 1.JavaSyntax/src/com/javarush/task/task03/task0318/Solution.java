package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanAge = new Scanner(System.in);
        Scanner scanname = new Scanner(System.in);
        int sAge = scanAge.nextInt();
        String name = scanname.nextLine();
        System.out.print(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
        //напишите тут ваш код
    }
}
