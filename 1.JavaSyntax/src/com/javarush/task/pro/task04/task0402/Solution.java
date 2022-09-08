package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner name =new Scanner(System.in);
        String b = name.nextLine();
        int a = 0;
        while (a < 10) {

            String text = " любит меня.";
            System.out.println(b + text);
            a++;
        }
    }
}
