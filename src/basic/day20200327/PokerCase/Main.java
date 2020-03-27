package basic.day20200327.PokerCase;

public class Main {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.shuffle();
        Glamber[] glambers = {new Glamber(), new Glamber(), new Glamber()};
        for (int i = 0; i < Poker.CardsAmount;) {
            for (int j = 0; j < 3; j++) {
                glambers[j].addHandCard(poker.draw());
                i++;
            }

        }
        for (int i = 0; i < glambers.length; i++) {
            System.out.println("赌徒"+i+"手牌：");
            for(Card card: glambers[i].handCards) {
                System.out.println(card);
            }
            System.out.println("=========================");
        }
    }
}
