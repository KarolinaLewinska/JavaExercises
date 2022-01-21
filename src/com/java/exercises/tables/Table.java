package com.java.exercises.tables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Table {
    public static String[] getLetters() {
        String[] lettersTable = {"A", "B", "C", "D", "E"};
        System.out.println("First letters of alphabet are: ");
        for (int i = 0; i < lettersTable.length; i++) {
            System.out.println(lettersTable[i] + ",");
        }
        return lettersTable;
    }

    public static Integer[] getReversedTable(Integer[] table) {
        List<Integer> list = Arrays.asList(table);
        Collections.reverse(list);
        System.out.println("Reversed table is: " + list);
        return table;
    }
}