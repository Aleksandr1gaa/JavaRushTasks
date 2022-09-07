package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        int A = age.nextInt();
        int a = 20;
        int b = 60;

        if (A < a || A > b) {
            System.out.println("можно не работать");
        }
    }
}
