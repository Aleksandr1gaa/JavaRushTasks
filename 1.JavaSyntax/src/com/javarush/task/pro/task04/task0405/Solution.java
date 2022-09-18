package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        String A = "Б";
        int a = 0;
        while (a < 10) {
            int b = 0;
            while (b < 20) {
                if (a == 0 || a == 9 || b == 0 || b == 19) {
                    System.out.print(A);
                } else {
                    System.out.print(" ");
                }
                b++;
            }
            System.out.println();
            a++;
        }

    }

}
            /*
            * Цикл в цикле :
            * Нужны квадраты ВНЕШНИЙ - И ВНУТРЕННИЙ: Делаю в обозначенных рамках счетчиками
            *  a до 10 и b до 20; ВНЕШНИЙ "Б", ВНУТРЕННИЙ " " ;
            *НА КОНСОЛЬ :
            * ББББББББББББББББББББ
              Б                  Б
              Б                  Б
              Б                  Б
              Б                  Б
              Б                  Б
              Б                  Б
              Б                  Б
              Б                  Б
              ББББББББББББББББББББ

                Process finished with exit code 0
            * */
            /*
            * Cycle inside cycle:
            *Need EXTERNAL AND INTERNAL squares:
            * I do it in the designated frames counters
            * a to 10 (internal "Б") and b to 20 (external " ") ;
            *
            * */




