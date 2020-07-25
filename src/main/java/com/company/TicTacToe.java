package main.java.com.company;

import com.sun.org.apache.xpath.internal.operations.String;

public class TicTacToe {
    private char[][] board;

    public void createBoard() {
        this.board = new char[][]{{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
    }

    public void printBoard() {
        for(char[] line : this.board) {
            for (char cell : line) {
                System.out.print(cell);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
