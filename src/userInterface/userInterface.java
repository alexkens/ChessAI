package src.userInterface;

import java.util.Scanner;

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
        this.inputWindow();
    }
    
    public void inputWindow() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("New Game?");
        System.out.println("y/n");

        String gameStatus = myObj.nextLine();  // Read user input
        if(gameStatus == "y") {
            this.startGame();
        } else if(gameStatus == "n") {
            this.endGame();
        } else {
            this.endGame();
        }

        System.out.println("What color do you want?");
        System.out.println("w/b");
        String userColor = myObj.nextLine();  // Read user inputWindow
        if(userColor == "w") {
            this.userColor = Color.WHITE;
        } else if(userColor == "b") {
            this.userColor = Color.BLACK;
        } else {
            System.out.println("wrong input");
            this.endGame();
        }
    }

    public void startGame() {
        this.game = new Game();

    }

    public void endGame() {
        System.exit(0);
    }

    public void makeMove(String startField, String endField) {
        this.game.board.makeMove(startField, endField, this.userColor);
    }
    
    

}

