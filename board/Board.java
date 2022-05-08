package board;


public class Board {


    Token[] board = new Token[64];



    public Board() {


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

        return fen;
    }

}