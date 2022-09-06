package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int a = time.nextInt();
        int b = time.nextInt();
        NOT_YET = "Искусственное мясо еще не готово.";
        DONE = "Искусственное мясо готово.";
        HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

        if (a == 0 && b == 30) {
            System.out.print(DONE);
        } else if (a == 0 && b < 30) {
            System.out.print(NOT_YET);
        } else if (a >= 0 && b >= 0) {
            System.out.print(HORRIBLY_DONE);
        }
    }
}
