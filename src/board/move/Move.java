package src.board.move;

public class Move {
    
    public int startPos;
    public int endPos;

    public boolean castling = false;
    public boolean enPassant = false;

    public Move(int startPos, int endPos){
        this.startPos = startPos;
        this.endPos = endPos;
    }
    
}
