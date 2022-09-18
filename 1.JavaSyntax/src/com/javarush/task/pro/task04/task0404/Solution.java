package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String c = "Q";
        int a = 0;
        while (a < 5) {

            int b = 1;
            while (b < 10) {
                System.out.print(c);
                b++;
            }
            System.out.println(c);
            a++;
        }


    }

}
        /*

        Цыкл в цыкле :                          Cycle inside a cycle :
        * a - Счетчик на строки;                a - counter for each row;
        * b - Счетчик на символы;               b - counter for charecters;
        *                                       *
        * НА КОНСОЛЕ:                           IN THE CONSOLE:

        *   QQQQQQQQQQQ                         QQQQQQQQQQQ
            QQQQQQQQQQQ                         QQQQQQQQQQQ
            QQQQQQQQQQQ                         QQQQQQQQQQQ
            QQQQQQQQQQQ                         QQQQQQQQQQQ
            QQQQQQQQQQQ                         QQQQQQQQQQQ

        */