package com.java.exercises;

import com.java.exercises.methods.Methods;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Methods.getAge(2000);
        Methods.getName("Karolina");
        Methods.countSumDifferenceAndProduct(new BigDecimal(20), new BigDecimal(10));
        Methods.checkIfNumberIsEven(201);
        Methods.checkIfNumberIsDividedByThreeAndFive(16);
        Methods.squareNumber(3);
        Methods.rootNumber(9);
        Methods.checkIfCanMakeRectangularTriangle(4, 9, 6);
    }
}