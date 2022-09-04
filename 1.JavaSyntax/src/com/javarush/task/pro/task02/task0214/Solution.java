package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String A = a.nextLine();
        String B = a.nextLine();
        String C = a.nextLine();

        System.out.println(C);
        System.out.println(B.toUpperCase());
        System.out.println(A.toLowerCase());

    }
}
// String A = a.nextLine();
//        System.out.println("Строка Номер Раз".toLowerCase());
//
//        String B = a.nextLine();
//        System.out.println("Вторая строка".toUpperCase());
//
//        String C = a.nextLine();
//        System.out.println("Строка 3");
//
//        System.out.println(C);
//        System.out.println(B);
//        System.out.println(A);