package test;


import org.junit.Test;

import src.board.Board;
import src.board.Token.Bishop;
import src.board.Token.King;
import src.board.Token.Knight;
import src.board.Token.Pawn;
import src.board.Token.Queen;
import src.board.Token.Rook;
import src.enums.Color;

public class BoardTest {
    
    @Test // empty board
    public void test1() {
        Board board = new Board();
        board.toString();

    }

    @Test // initial position
    public void test2() {
        Board board = new Board();

        Color b = Color.BLACK;
        Color w = Color.WHITE;
        
        board.setToken(new Rook(w), 0);
        board.setToken(new Knight(w), 1);
        board.setToken(new Bishop(w), 2);
        board.setToken(new Queen(w), 3);
        board.setToken(new King(w), 4);
        board.setToken(new Bishop(w), 5);
        board.setToken(new Knight(w), 6);
        board.setToken(new Rook(w), 7);
        for(int i=0; i < 8; i++) {
            board.setToken(new Pawn(w), 8 + i);
        }
        board.setToken(new Rook(b), 56);
        board.setToken(new Knight(b), 57);
        board.setToken(new Bishop(b), 58);
        board.setToken(new Queen(b), 59);
        board.setToken(new King(b), 60);
        board.setToken(new Bishop(b), 61);
        board.setToken(new Knight(b), 62);
        board.setToken(new Rook(b), 63);
        for(int i=0; i < 8; i++) {
            board.setToken(new Pawn(b), 48 + i);
        }

        board.toString();
    }
}
