package src.board;

import java.util.ArrayList;

import src.board.Token.Token;
import src.board.move.Move;
import src.enums.Color;

public class Board {


    public Token[] board = new Token[64];

    public ArrayList<Move> moveHistory = new ArrayList<Move>();
    public ArrayList<Move> wMoveHistory = new ArrayList<Move>();
    public ArrayList<Move> bMoveHistory = new ArrayList<Move>();

    // available Moves
    public ArrayList<Integer> wPawnList = new ArrayList<Integer>();
    public ArrayList<Integer> wRookList = new ArrayList<Integer>();
    public ArrayList<Integer> wKnightList = new ArrayList<Integer>();
    public ArrayList<Integer> wBishopList = new ArrayList<Integer>();
    public ArrayList<Integer> wKingList = new ArrayList<Integer>();
    public ArrayList<Integer> wQueenList = new ArrayList<Integer>();
    
    
    public ArrayList<Integer> bPawnList = new ArrayList<Integer>();
    public ArrayList<Integer> bRookList = new ArrayList<Integer>();
    public ArrayList<Integer> bKnightList = new ArrayList<Integer>();
    public ArrayList<Integer> bBishopList = new ArrayList<Integer>();
    public ArrayList<Integer> bKingList = new ArrayList<Integer>();
    public ArrayList<Integer> bQueenList = new ArrayList<Integer>();


    public Board() {
        for(int i=0; i < 64; i++) {
            this.board[i] = new Token();
        }
    }


    public void setToken(Token token, int pos) {
        if(this.board[pos].free) {
            this.board[pos] = token;
            return;
        }
    }

    public void removeToken(int pos) {
        this.board[pos] = new Token();
    }

    public void makeMove(String startField, String endField, Color userColor) {
        Token token = this.board[Board.fieldToNumber(startField)];
        if(token.color != userColor) {
            System.out.println("wrong color");
            return;
        }
        if(token.free) {
            System.out.println("field is empty");
        }

        this.setToken(token, Board.fieldToNumber(endField));
        Move move = new Move(Board.fieldToNumber(startField), Board.fieldToNumber(endField));
        this.moveHistory.add(move);
        if(userColor == Color.WHITE) {
            this.wMoveHistory.add(move);
        } else {
            this.bMoveHistory.add(move);
        }
        this.removeToken(Board.fieldToNumber(startField));

        
    }



    // TODO
    public static Board convertFenToGame(String fen) {

        Board board = new Board();


        return board;
    }

    // TODO
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


    public static String numberToField(int intField) {
        intField++;
        if(intField < 1 || intField > 64) {
          return "Error";
        }
        int counter = 1;
        while(intField > 8) {
          intField = intField - 8;
          counter++;
        }
        String array[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h" };
        StringBuilder stringField = new StringBuilder("");
        stringField.append(array[intField-1]);
        stringField.append(counter);
    
        return stringField.toString();
      }


    public static int fieldToNumber(String field) {
        int number = -1;

        String array[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h" };
        for(int i=0; i < 8; i++) {
            if(field.charAt(0) == array[i].charAt(0)) {
                number = i;
                break;
            }
        }
        int tmp = Character.getNumericValue(field.charAt(1));
        tmp = (tmp - 1) * 8;

        if(number < 0 || number > 7 || tmp < 0 || tmp > 56) {
            System.out.println("wrong input");
        }

        return number + tmp;
    }

}