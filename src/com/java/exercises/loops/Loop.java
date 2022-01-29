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

    public static void printReversedText(String text) {
        String reversedText = "";
        for (int i=0; i < text.length(); i++) {
            char letter = text.charAt(i);
            reversedText = letter + reversedText;
            System.out.println(reversedText);
        }
    }

    public static int convertToBinary(int number) {
       int dividedNumber = number;
       int restOfDivision;
       String numberToText = "";
       do {
           restOfDivision = dividedNumber % 2;
           dividedNumber = dividedNumber / 2;
           System.out.println(restOfDivision);
           numberToText = restOfDivision + numberToText;
       } while (dividedNumber > 0);
       System.out.println("Binary value of " + number + " equals " + numberToText);
       return Integer.parseInt(numberToText);
    }
}