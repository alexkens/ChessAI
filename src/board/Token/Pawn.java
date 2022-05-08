package src.board.Token;

import src.enums.Color;

public class Pawn extends Token {
    protected String colorStr;
    
    public Pawn(Color color) {
        this.free = false;

        this.color = color;
        if(this.color == Color.WHITE) {
            this.colorStr = "P";
        } else {
            this.colorStr = "p";
        }
    }

    public String toString() {
        return new String(this.colorStr);
    }
}
