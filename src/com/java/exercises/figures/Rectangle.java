package com.java.exercises.figures;

import com.java.exercises.interfaces.Figure;

public class Rectangle implements Figure {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getRectangleDiagonalLength() {
        double diagonalLength = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("Length of diagonal equals " + diagonalLength);
        return diagonalLength;
    }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * length + 2 * width;
        System.out.println("The perimeter of rectangle with sides' length " + length + " and " + width + " equals");
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * width;
        System.out.println("The area of rectangle with sides' length " + length + " and " + width + " equals");
        return area;
    }
}