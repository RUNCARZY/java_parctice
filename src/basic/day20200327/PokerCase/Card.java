package basic.day20200327.PokerCase;

public class Card {
    private String suit;
    private String point;
    private String face;

    public Card(String suit, String point) {
        this.suit = suit;
        this.point = point;
        this.face = suit + point;
    }

    public String getFace() {
        return face;
    }

    @Override
    public String toString() {
        return this.face;
    }
}
