package com.javarush.task.pro.task02.task0218;

import java.util.Scanner;

/*
Ручное управление
*/

public class Solution {
    public static void main(String[] args) {
        // создаем объект класса Scanner для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // объявляем переменную numberOne типа int и присваиваем ей
        // целое число считанное с клавиатуры
        int numberOne = scanner.nextInt();
        // объявляем переменную numberTwo типа int и присваиваем ей
        // целое число считанное с клавиатуры
        int numberTwo = scanner.nextInt();
        // объявляем переменную numberThree типа int и присваиваем ей
        // целое число считанное с клавиатуры
        int numberThree = scanner.nextInt();
        // выводим на экран результат произведения значений переменных
        // numberOne, numberTwo и numberThree
        System.out.println(numberOne * numberTwo * numberThree);
    }
}

