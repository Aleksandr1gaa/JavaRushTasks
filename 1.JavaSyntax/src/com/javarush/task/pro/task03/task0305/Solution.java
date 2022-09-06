package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        int c = number.nextInt();

        if (a == b && a == c) {
            System.out.print(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.print(a + " " + b);
        } else if (a == c) {
            System.out.print(a + " " + c);
        } else if (b == c) {
            System.out.print(b + " " + c);
        }
    }
}
