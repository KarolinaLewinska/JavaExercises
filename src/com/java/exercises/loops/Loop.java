package com.java.exercises.loops;

import java.util.Scanner;

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
        for (int i = 0; i < textValue.length(); i++) {
            System.out.println(textValue.charAt(textValue.length() - 1 - i));
        }
    }

    public static void printReversedText(String text) {
        String reversedText = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            reversedText = letter + reversedText;
        }
        System.out.println(reversedText);
    }

    public static int convertToBinary(int number) {
       int dividedNumber = number;
       int restOfDivision;
       StringBuilder numberToText = new StringBuilder();
       do {
           restOfDivision = dividedNumber % 2;
           dividedNumber = dividedNumber / 2;
           numberToText.insert(0, restOfDivision);
       } while (dividedNumber > 0);
       System.out.println("Binary value of " + number + " equals " + numberToText);
       return Integer.parseInt(numberToText.toString());
    }

    public static boolean isPalindrome(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text);
        String reversedText = stringBuilder.reverse().toString();
        if (text.equals(reversedText)) {
            System.out.println("Word " + text + " is a palindrome");
            return true;
        }
        System.out.println("Word " + text + " is not a palindrome");
        return false;
    }

    public static void printIntegerTable(int[] numbersTable) {
        System.out.print("[");
        for (int i = 0; i < numbersTable.length; i++) {
            if (i == numbersTable.length-1) {
                System.out.print(numbersTable[i]);
            } else {
                System.out.print(numbersTable[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static int[] sortTableByBubbleSort(int[] numbersTable) {
        for (int i = 0; i < numbersTable.length - 1; i++) {
            for (int j = 0; j < numbersTable.length - 1; j++) {
                if (numbersTable[j] > numbersTable[j + 1]) {
                    int temp = numbersTable[j];
                    numbersTable[j] = numbersTable[j + 1];
                    numbersTable[j + 1] = temp;
                }
            }
        }
        System.out.println("Values of sorted table: ");
        for (int i : numbersTable) {
            System.out.print(i + " ");
        }
        System.out.println();
        return numbersTable;
    }

    public static void showBinaryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number to convert");
        try {
            int userNumber = Integer.parseInt(scanner.nextLine());
            convertToBinary(userNumber);
        }
        catch (NumberFormatException exc) {
            System.out.println("Only natural numbers are allowed! Try again!");
        }
    }

    public static void showWordInfo(String word) {
        System.out.println("The length of word: " + word + " equals: " + word.length());
        isPalindrome(word);
        printReversedText(word);
    }
}