package com.java.exercises.objects;

public class MyNumber {
    double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd() {
        if (number % 2 != 0) {
            System.out.println("The number is odd");
            return true;
        }
        System.out.println("The number is not odd");
        return false;
    }

    public boolean isEven() {
        if (number % 2 == 0) {
            System.out.println("The number is even");
            return true;
        }
        System.out.println("The number is not even");
        return false;
    }

    public double countRoot() {
        double root = Math.sqrt(number);
        System.out.println("The root of number " + number + " equals " + root);
        return root;
    }

    public double countPow(int powerValue) {
        double pow = Math.pow(number, powerValue);
        System.out.println("The power of " + number + " equals " + pow);
        return pow;
    }

    public double add(MyNumber numberToAdd) {
        double sum = number + numberToAdd.number;
        System.out.println("The sum of " + number + " and " + numberToAdd.number + " equals " + sum);
        return sum;
    }

    public double substract(MyNumber secondNumber) {
        double difference = number - secondNumber.number;
        System.out.println("The difference of " + number + " and " + secondNumber.number + " equals " + difference);
        return difference;
    }
}
