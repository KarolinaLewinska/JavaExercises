package com.java.exercises;

import com.java.exercises.figures.Circle;
import com.java.exercises.figures.RightTriangle;
import com.java.exercises.interfaces.Figure;
import com.java.exercises.loops.ArrayFactory;
import com.java.exercises.loops.Loop;
import com.java.exercises.methods.Methods;
import com.java.exercises.objects.Human;
import com.java.exercises.objects.MyNumber;
import com.java.exercises.figures.Rectangle;
import com.java.exercises.tables.Table;

import java.math.BigDecimal;
import java.util.Scanner;

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
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.getRectangleDiagonalLength();

        MyNumber firstNumber = new MyNumber(50.0);
        MyNumber secondNumber = new MyNumber(25.0);
        firstNumber.isOdd();
        firstNumber.isEven();
        firstNumber.countRoot();
        firstNumber.countPow(2);
        firstNumber.add(secondNumber);
        firstNumber.substract(secondNumber);

        //package tables
        Integer[] table = {1,2,3};
        Table.getLetters();
        Table.getReversedTable(table);

        //package loops
        Loop.showNumbersRange(20);
        Loop.printReversedNumber(123456);
        Loop.printReversedText("dog");
        Loop.convertToBinary(21);
        Loop.isPalindrome("level");
        int[] numbersTable = {11,2,34,4,5,66,7,8,9};
        Loop.printIntegerTable(numbersTable);
        Loop.sortTableByBubbleSort(numbersTable);
        Loop.showBinaryNumber();
        Loop.showWordInfo("Karolina");
        ArrayFactory arrayFactory = new ArrayFactory(30);
        arrayFactory.createOneDimensionTable();
        arrayFactory.createTwoDimensionTable();
        arrayFactory.createIdentityMatrix();
        arrayFactory.createAndSortList(numbersTable);

        //package figures
        Scanner scanner = new Scanner(System.in);
        Figure[] figures = new Figure[3];
        System.out.println("Type radiatus' length of a triangle");
        figures[0] = new Circle(scanner.nextDouble());
        System.out.println("Type sides' lengths of rectangle");
        figures[1] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Type cathetuses' lengths of right triangle");
        figures[2] = new RightTriangle(scanner.nextDouble(), scanner.nextDouble());

        for (Figure figure : figures) {
            System.out.println(figure.getArea());
            System.out.println(figure.getPerimeter());
        }
    }
}