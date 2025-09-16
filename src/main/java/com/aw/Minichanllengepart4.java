package com.aw;

public class Minichanllengepart4 {
    public static void main(String[] args) {
        int maths = 75;
        int science = 60;
        int english = 80;

        int total = maths + science + english;
        double percentage = (total * 100.0) / 300.0;

        System.out.println(total);
        System.out.println(percentage);

        String result = percentage >= 40.0 ? "Pass" : "Fail";
        System.out.println(result);
    }
}
