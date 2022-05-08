package src.board.Token;

import src.enums.Color;

public class Queen extends Token {
    protected Color color;
    protected String colorStr;
    
    public Queen(Color color) {
        this.free = false;

        this.color = color;
        if(this.color == Color.WHITE) {
            this.colorStr = "Q";
        } else {
            this.colorStr = "q";
        }
    }

    public String toString() {
        return new String(this.colorStr);
    }
}
