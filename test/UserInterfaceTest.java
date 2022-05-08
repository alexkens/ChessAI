package test;

import org.junit.Test;

import src.enums.Color;
import src.userInterface.UserInterface;

public class UserInterfaceTest {

    @Test
    public void test1() {
        UserInterface ui = new UserInterface(Color.WHITE);
        ui.startGame();
        ui.game.board.toString();
    }
    
}
