package com.java.exercises.loops;

public class ArrayFactory {
    int tableSize;

    public ArrayFactory(int tableSize) {
        this.tableSize = tableSize;
    }

    public int[] createOneDimensionTable() {
        int[] table = new int[tableSize];
        System.out.println("One dimension table with size: " + tableSize + " was created");
        return table;
    }

    public int[][] createTwoDimensionTable() {
        int[][] table = new int[tableSize][tableSize];
        System.out.println("Two dimension table with size: " + tableSize + " was created");
        return table;
    }
}