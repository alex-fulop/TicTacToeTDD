package test.java.com.company;

import main.java.com.company.TicTacToe;
import org.junit.Test;

public class TicTacToeTest {
    @Test
    public void createGame() {
        TicTacToe game = new TicTacToe();
        game.createBoard();
        game.printBoard();
    }
}
