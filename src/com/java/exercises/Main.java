package com.java.exercises;

import com.java.exercises.methods.Methods;
import com.java.exercises.objects.Human;
import com.java.exercises.objects.Rectangle;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        //package methods
        Methods.getAge(2000);
        Methods.getName("Karolina");
        Methods.countSumDifferenceAndProduct(new BigDecimal(20), new BigDecimal(10));
        Methods.checkIfNumberIsEven(201);
        Methods.checkIfNumberIsDividedByThreeAndFive(16);
        Methods.squareNumber(3);
        Methods.rootNumber(9);
        Methods.checkIfCanMakeRectangularTriangle(4, 9, 6);

        //package objects
        Human human = new Human("Karolina", 22, 65.00f, 170, "Woman");
        human.printData();

        Rectangle rectangle = new Rectangle(20.0, 20.0);
        rectangle.countRectangleArea();
        rectangle.countRectanglePerimeter();
        rectangle.countRectangleDiagonalLength();
    }
}