package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static String TRIANGLE_EXISTS = "треугольник существует";
    private static String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner traingl = new Scanner(System.in);
        int a = traingl.nextInt();
        int b = traingl.nextInt();
        int c = traingl.nextInt();
        TRIANGLE_EXISTS = "треугольник существует";
        TRIANGLE_NOT_EXISTS = "треугольник не существует";

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.print(TRIANGLE_EXISTS);
        } else if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            System.out.print(TRIANGLE_NOT_EXISTS);
        }
    }
}

