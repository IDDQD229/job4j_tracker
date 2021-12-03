package ru.job4j.collection;

import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int listIndex = 0;
        for (int grupIndex = 0; grupIndex < groups; grupIndex++) {
            for (int cellIndex = 0; cellIndex < cells; cellIndex++) {
                if (listIndex < list.size()) {
                    array[grupIndex][cellIndex] = list.get(listIndex++);
                } else {
                    array[grupIndex][cellIndex] = 0;
                }
            }

        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}