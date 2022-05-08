package src.board.Token;

import src.enums.Color;

public class Rook extends Token {
    protected String colorStr;
    
    public Rook(Color color) {
        this.free = false;

        this.color = color;
        if(this.color == Color.WHITE) {
            this.colorStr = "R";
        } else {
            this.colorStr = "r";
        }
    }

    public String toString() {
        return new String(this.colorStr);
    }
}
