package com.java.exercises.figures;

import com.java.exercises.interfaces.Figure;

public class RightTriangle implements Figure {
    double firstCathetus;
    double secondCathetus;

    public RightTriangle(double firstCathetus, double secondCathetus) {
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
    }

    @Override
    public double getPerimeter() {
        double thirdLength = Math.sqrt(firstCathetus * firstCathetus + secondCathetus * secondCathetus);
        double perimeter = firstCathetus + secondCathetus + thirdLength;
        System.out.println("The perimeter of triangle with lengths: " + firstCathetus + " " + secondCathetus + " " + thirdLength + " equals");
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = (firstCathetus * secondCathetus) / 2;
        System.out.println("The area of triangle with cathetuses: " + firstCathetus + " " + secondCathetus + " equals");
        return area;
    }
}