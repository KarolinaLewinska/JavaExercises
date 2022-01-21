package com.java.exercises.loops;

public class Loop {
    public static void showNumbersRange(int maxValue) {
        if (maxValue <= 0)  {
            System.out.println("Number must be greater than zero");
        } else {
            for (int i = 0; i <= maxValue; i++) {
                System.out.println(i);
            }
        }
    }
}