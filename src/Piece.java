public class Piece {
    private String piece;
    public Piece() {
        this.piece = (Math.random() <= 0.2) ? "pile": "face";
    }
    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

}
