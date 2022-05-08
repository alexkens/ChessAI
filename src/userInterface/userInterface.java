package src.userInterface;

import src.board.Board;
import src.board.Token.Token;
import src.board.move.Move;
import src.enums.Color;
import src.game.Game;

public class UserInterface {

    public Color userColor;
    public Game game;

    public UserInterface(Color color) {
        this. userColor = color;
    }
    

    public void startGame() {
        this.game = new Game();

    }

    public void makeMove(String startField, String endField) {
        this.game.board.makeMove(startField, endField, this.userColor);
    }
    
}

