package src.board.Token;

import src.enums.Color;

public class Knight extends Token {
    protected Color color;
    protected String colorStr;
    
    public Knight(Color color) {
        this.free = false;

        this.color = color;
        if(this.color == Color.WHITE) {
            this.colorStr = "N";
        } else {
            this.colorStr = "n";
        }
    }

    public String toString() {
        return new String(this.colorStr);
    }
}
