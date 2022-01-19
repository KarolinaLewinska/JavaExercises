package com.java.exercises.methods;

import java.math.BigDecimal;
import java.time.Year;
import java.util.stream.Stream;

public class Methods {
    public static int getAge(int yearOfBirth) {
        int currentYear = Year.now().getValue();
        int age = currentYear - yearOfBirth;
        System.out.println("Your age is " + age);
        return age;
    }

    public static String getName(String name) {
        System.out.println("Your name is " + name);
        return name;
    }

    public static void countSumDifferenceAndProduct(BigDecimal firstNum, BigDecimal secondNum) {
        float secondNumToFloat = secondNum.floatValue();

        BigDecimal sum = firstNum.add(new BigDecimal(secondNumToFloat));
        BigDecimal difference = firstNum.subtract(secondNum);
        BigDecimal product = firstNum.multiply(secondNum);

        System.out.println("Sum of " + firstNum + " and " + secondNum + " equals " + sum);
        System.out.println("Difference of " + firstNum + " and " + secondNum + " equals " + difference);
        System.out.println("Product of " + firstNum + " and " + secondNum + " equals " + product);
    }

    public static boolean checkIfNumberIsEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
            return true;
        }
        System.out.println("Number " + number + " is not even");
        return false;
    }

    public static boolean checkIfNumberIsDividedByThreeAndFive(int number) {
        if (number % 3 == 0 && number % 5 == 0 ) {
            System.out.println("Number "  + number + " can be divided by 3 and 5");
            return true;
        }
        System.out.println("Number "  + number + " cannot be divided by 3 and 5");
        return false;
    }

    public static int squareNumber(int number) {
        int squaredNumber = number * number * number;
        System.out.println("Squared number of " + number + " equals " + squaredNumber);
        return squaredNumber;
    }

    public static double rootNumber(double number) {
        double rootedNumber = Math.sqrt(number);
        System.out.println("Rooted number equals " + rootedNumber);
        return rootedNumber;
    }

    public static boolean checkIfCanMakeRectangularTriangle(int firstLength, int secondLength, int thirdLength) {
        int theLongestLength = Stream.of(firstLength, secondLength, thirdLength).max(Integer::compareTo).get();

        if (theLongestLength == firstLength && theLongestLength < secondLength + thirdLength) {
            System.out.println("Is possible to make rectangular triangle with the length " + firstLength + ", " + secondLength + ", " + thirdLength);
            return true;
        } else if (theLongestLength == secondLength && theLongestLength < firstLength + thirdLength) {
            System.out.println("Is possible to make rectangular triangle with the length " + firstLength + ", " + secondLength + ", " + thirdLength);
            return true;
        } else if (theLongestLength == thirdLength && theLongestLength < firstLength + secondLength) {
            System.out.println("Is possible to make rectangular triangle with the length " + firstLength + ", " + secondLength + ", " + thirdLength);
            return true;
        } else {
            System.out.println("Is not possible to make rectangular triangle with the length " + firstLength + ", " + secondLength + ", " + thirdLength);
            return false;
        }
    }
}
