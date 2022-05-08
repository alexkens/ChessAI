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



    public static Board convertFenToGame(String fen) {

        Board board = new Board();


        return board;
    }

    public static String convertBoardToFen(Board board) {

        StringBuilder fen = new StringBuilder();

        return fen.toString();
    }

    public String toString() {
        String str = new String();

        System.out.println("  ABCDEFGH");

        int offset = 56;
        int counter = 8;
        while(offset >= 0) {
            System.out.print(counter + " ");
            for(int i=0; i < 8; i++) {
                System.out.print(this.board[offset + i].toString());
            }
            offset = offset - 8;
            System.out.println();
            counter--;
        }

        return str;
    }

}