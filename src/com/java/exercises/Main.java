package com.java.exercises;

import com.java.exercises.methods.Methods;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Methods.getAge(2000);
        Methods.getName("Karolina");
        Methods.countSumDifferenceAndProduct(new BigDecimal(20), new BigDecimal(10));
    }
}