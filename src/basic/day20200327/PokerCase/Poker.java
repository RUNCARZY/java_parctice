package basic.day20200327.PokerCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Poker {
    private ArrayList<Card> cards = new ArrayList<>();
    public static final int CardsAmount = 52;
    private Iterator<Card> caller;

    public Poker() {
            String[] suits = {"黑桃", "红桃", "梅花", "方块"};
            String[] points = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                this.cards.add(new Card(suits[j], points[i]));
            }
        }
        this.caller = cards.iterator();
    }

    // 抽/发一张牌
    public Card draw() {
        if (this.caller.hasNext()) {
            return caller.next();
        }else {
            return null;
        }
    }

    // 洗牌
    public void shuffle() {
        Random rd = new Random();
        for (int i = 0; i < CardsAmount-1; i++) {
            int target = rd.nextInt(CardsAmount-i) + i;
            Card cur = this.cards.get(i);
            Card tar = this.cards.get(target);
            this.cards.set(i, tar);
            this.cards.set(target, cur);
        }
    }

    // 回收纸牌，重新开始
    public void recycle() {
        this.shuffle();
        this.caller = this.cards.iterator();
    }
}
