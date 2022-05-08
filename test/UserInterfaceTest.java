package test;

import org.junit.Test;

import src.enums.Color;
import src.userInterface.UserInterface;

public class UserInterfaceTest {

    @Test
    public void test1() {
        UserInterface ui = new UserInterface(Color.WHITE);
        ui.startGame();
        ui.makeMove("a2", "a3");
        ui.makeMove("e2", "e4");
        ui.game.board.toString();
    }
    
}
