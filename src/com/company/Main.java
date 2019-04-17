package com.company;

public class Main {

    public static void main(String[] args) {

        int row, column;

        for (column = 1; column <= 9; column++){
            for (int i = 1; i <= column; i++){
                row = column;
                System.out.print(row);
            }
            System.out.println();
        }

    }
}
