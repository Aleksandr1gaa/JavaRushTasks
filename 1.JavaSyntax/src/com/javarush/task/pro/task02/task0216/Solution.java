package com.javarush.task.pro.task02.task0216;

/* 
Генератор позитивных новостей
*/

public class Solution {
    public static void main(String[] args) {
        String name = "Учёный";
        String date = "17.06.35";
        String time = "в 17:15";
        String noun = "прибор";
        String adjective = "удивительный";
        String verb = "передаёт и применяется";

        System.out.println("Новости:");
        System.out.println(name + " " + date + " " + time + " изобрел " + adjective + " " + noun + " который " + verb + " террабайты данных в минуту.");
    }
}
