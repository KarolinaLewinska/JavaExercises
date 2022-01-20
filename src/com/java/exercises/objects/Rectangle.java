package com.java.exercises.objects;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double countRectangleArea() {
        double area = length * width;
        System.out.println("Area of rectangle equals " + area);
        return area;
    }

    public double countRectanglePerimeter() {
        double perimeter = 2 * length + 2 * width;
        System.out.println("Perimeter of rectangle equals " + perimeter);
        return  perimeter;

    }

    public double countRectangleDiagonalLength() {
        double diagonalLength = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("Length of diagonal equals " + diagonalLength);
        return diagonalLength;
    }
}