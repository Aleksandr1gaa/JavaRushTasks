package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
                int A = a.nextInt();
                int B = a.nextInt();
                int C = a.nextInt();
                int D = (A+B+C)/3;

               System.out.println(D);

    }
}
