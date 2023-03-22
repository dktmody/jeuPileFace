public class Piece {

    private String pile;
    private String face;


    public Piece(String pile, String face) {
        this.pile = pile;
        this.face = face;
    }


    public String getPile() {
        return pile;
    }

    public void setPile(String pile) {
        this.pile = pile;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}
