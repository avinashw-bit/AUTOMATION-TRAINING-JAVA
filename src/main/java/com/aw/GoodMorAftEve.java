package com.aw;
import java.time.LocalTime;

public class GoodMorAftEve {
    public static void main(String[] args) {
        int hour = LocalTime.now().getHour(); // 0-23

        if (hour >= 0 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour < 18) {
            System.out.println("Good Afternoon");
        } else if (hour < 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Invalid hour");
        }
    }
}
