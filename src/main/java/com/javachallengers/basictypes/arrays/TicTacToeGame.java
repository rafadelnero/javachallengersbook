package com.javachallengers.basictypes.arrays;

public class TicTacToeGame {

    public static void main(String[] args) {
        String [][] tictactoeBoard = new String[3][3];

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                tictactoeBoard[row][column] = row + "," + column + "|";
                System.out.print(tictactoeBoard[row][column]);
            }
            System.out.println();
        }

    }
}
