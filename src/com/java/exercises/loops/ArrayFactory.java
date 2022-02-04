package com.java.exercises.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayFactory {
    int size;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public int[] createOneDimensionTable() {
        int[] table = new int[size];
        System.out.println("One dimension table with size: " + size + " was created");
        return table;
    }

    public int[][] createTwoDimensionTable() {
        int[][] table = new int[size][size];
        System.out.println("Two dimension table with size: " + size + " was created");
        return table;
    }

    public int[][] createIdentityMatrix() {
        int[][] matrix = createTwoDimensionTable();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }

    public void createAndSortList(int[] numbersToAdd) {
        Integer[] convertedTable = Arrays.stream(numbersToAdd).boxed().toArray(Integer[]::new);
        List<Integer> numbersList = new ArrayList<>(size);
        numbersList.addAll(Arrays.stream(convertedTable).toList());
        Collections.sort(numbersList);
        numbersList.forEach(System.out::println);
    }
}