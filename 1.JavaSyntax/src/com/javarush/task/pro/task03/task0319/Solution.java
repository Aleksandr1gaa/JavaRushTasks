package com.javarush.task.pro.task03.task0319;

public class Solution {

    public static void main(String[] args) {
        int temperatureLow, temperatureMiddle, temperatureHigh, time;
        temperatureLow = 100;
        temperatureMiddle = 400;
        temperatureHigh = 1000;
        time = 50;
        String result = time > 40 ? "Мясо сгорело" : time < 35 ? "Мясо готовится" : "Мясо готово";

        System.out.println(result);
    }
}
        /*

        Можно подругому
        ? == if
        : == else
        if (time > 40) {
         System.out.println("Мясо сгорело");
         } else if (time < 35) {
         System.out.println("Мясо сгорело");
         } else {
         System.out.println("Мясо сгорело");
         }

         */