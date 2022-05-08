package src.board;

import src.board.Token.Token;

public class Board {


    public Token[] board = new Token[64];


    public Board() {
        for(int i=0; i < 64; i++) {
            this.board[i] = new Token();
        }

    }




    public void setToken(Token token, int pos) {
        this.board[pos] = token;
    }



    public Board convertFenToGame(String fen) {

        Board board = new Board();


        return board;
    }

    public String convertBoardToFen() {

        StringBuilder fen = new StringBuilder();

        return fen.toString();
    }

    public String toString() {
        String str = new String();

        int offset = 56;
        while(offset >= 0) {
            for(int i=0; i < 8; i++) {
                System.out.print(this.board[offset + i]);
                offset = offset - 8;
            }
            System.out.println();
        }

        return str;
    }

}