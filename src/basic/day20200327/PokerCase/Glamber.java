package basic.day20200327.PokerCase;

import java.util.ArrayList;

public class Glamber {
    public ArrayList<Card> handCards = new ArrayList<>();

    public void addHandCard(Card card) {
        if (card!=null) {
            this.handCards.add(card);
        }
    }
}
