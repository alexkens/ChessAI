package src.board.Token;

import src.enums.Color;

public class King extends Token {
    protected Color color;
    protected String colorStr;
    
    public King(Color color) {
        this.free = false;

        this.color = color;
        if(this.color == Color.WHITE) {
            this.colorStr = "K";
        } else {
            this.colorStr = "k";
        }
    }

    public String toString() {
        return new String(this.colorStr);
    }
}
