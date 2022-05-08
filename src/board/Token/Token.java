package src.board.Token;

import src.enums.Color;

public class Token {
    
    boolean free = true;
    public Color color;


    @Override
    public String toString() {
        return new String("_");
    }
}
