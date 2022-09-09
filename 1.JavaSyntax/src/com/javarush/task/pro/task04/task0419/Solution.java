package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        if (number > 0) {
            int i =0;
            while (i <= number) {
                sum = sum + i;
                i++;

            }
        }
        System.out.println(sum);
        /*
        i это счетчик (i = it is counter)
        0+0
        0+1
        1+2
        3+3
        6+4
        10+5
        ==15
         */
    }
}