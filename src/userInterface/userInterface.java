package src.userInterface;

import src.board.Board;
import src.board.Token.Token;
import src.board.move.Move;
import src.enums.Color;
import src.game.Game;

public class userInterface {

    Color userColor;
    Game game;

    public userInterface(Color color) {
        this. userColor = color;
    }
    

    public void startGame() {
        this.game = new Game();

    }

    public void makeMove(String startField, String endField) {
        Token token = this.game.board.board[Board.fieldToNumber(startField)];
        if(token.color != this.userColor) {
            System.out.println("wrong color");
            return;
        }
        if(token.free) {
            System.out.println("field is empty");
        }

        Move move = new Move(Board.fieldToNumber(startField), Board.fieldToNumber(endField));
        this.game.board.moveList.add(move);

    }
    
}
