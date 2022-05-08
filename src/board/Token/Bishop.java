package src.board.Token;

import src.enums.Color;

public class Bishop extends Token{
    
    protected Color color;
    protected String colorStr;
    
    public Bishop(Color color) {
        this.free = false;

        this.color = color;
        if(this.color == Color.WHITE) {
            this.colorStr = "B";
        } else {
            this.colorStr = "b";
        }
    }

    public String toString() {
        return new String(this.colorStr);
    }
}
