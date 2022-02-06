package com.java.exercises.figures;

import com.java.exercises.interfaces.Figure;

public class Circle implements Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of circle with radius: " + radius + " equals");
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of circle with radius: " + radius + " equals");
        return area;
    }
}