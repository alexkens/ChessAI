package src.game;

import src.enums.*;
import src.board.Board;
import src.board.Token.*;

public class Game {

    public boolean winW = false;
    public boolean winB = false;

    public Color turn = Color.WHITE;

    public int halfMoveCounter = 0;
    public int wholeMoveCounter = 1;

    public Board board;

    public Game() {
        this.board = new Board();

        Color b = Color.BLACK;
        Color w = Color.WHITE;
        
        this.board.setToken(new Rook(w), 0);
        this.board.setToken(new Knight(w), 1);
        this.board.setToken(new Bishop(w), 2);
        this.board.setToken(new Queen(w), 3);
        this.board.setToken(new King(w), 4);
        this.board.setToken(new Bishop(w), 5);
        this.board.setToken(new Knight(w), 6);
        this.board.setToken(new Rook(w), 7);
        for(int i=0; i < 8; i++) {
            this.board.setToken(new Pawn(w), 8 + i);
        }
        this.board.setToken(new Rook(b), 56);
        this.board.setToken(new Knight(b), 57);
        this.board.setToken(new Bishop(b), 58);
        this.board.setToken(new Queen(b), 59);
        this.board.setToken(new King(b), 60);
        this.board.setToken(new Bishop(b), 61);
        this.board.setToken(new Knight(b), 62);
        this.board.setToken(new Rook(b), 63);
        for(int i=0; i < 8; i++) {
            this.board.setToken(new Pawn(b), 48 + i);
        }

    }

    


    
    
}
