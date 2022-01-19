package com.java.exercises.methods;

import java.math.BigDecimal;
import java.time.Year;

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
}
