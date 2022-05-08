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