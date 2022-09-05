package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner data = new Scanner(System.in);
        String name = data.nextLine();
        int age = data.nextInt();
        if (age >= 18&& age <= 28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
