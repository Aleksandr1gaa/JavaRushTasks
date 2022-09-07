package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner coordinates = new Scanner(System.in);
        int x = coordinates.nextInt();
        int y = coordinates.nextInt();
        boolean first = (x > 0 && y > 0);
        boolean second = (x < 0 && y > 0);
        boolean third = (x < 0 && y < 0);
        boolean fourth = (x > 0 && y < 0);

        if (first) {
            System.out.println("1");
        } else if (second) {
            System.out.println("2");
        } else if (third) {
            System.out.println("3");
        } else if (fourth) {
            System.out.println("4");
        }
    }
}
