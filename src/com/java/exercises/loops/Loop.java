package com.java.exercises.loops;

public class Loop {
    public static void showNumbersRange(int maxValue) {
        if (maxValue <= 0)  {
            System.out.println("Number must be greater than zero");
        } else {
            System.out.println("Usage of for loop:");
            for (int i = 0; i <= maxValue; i++) {
                System.out.println(i);
            }
            int i = 0;
            System.out.println("Usage of while loop:");
            while (i <= maxValue) {
                System.out.println(i);
                i++;
            }
        }
    }

    public static void printReversedNumber(int number) {
        String textValue = String.valueOf(number);
        for (int i=0; i < textValue.length(); i++) {
            System.out.println(textValue.charAt(textValue.length() - 1 - i));
        }
    }
}