package game.poker;

import utilities.Card;

import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand(List<Card> cardList){
        cards = cardList;
    }

    public List<Card> getHand(){
        return cards;
    }
}
