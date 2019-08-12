package utilities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        for(CardNaipes naipe : CardNaipes.values()){
            for(CardValues value : CardValues.values()){
                cards.add(new Card(naipe, value));
            }
        }
    }

    public List<Card> showCards(){
        return cards;
    }

    public List<Card> getRandomCards(int amountOfCards) {
        List<Card> cardsToReturn = new ArrayList<>();
        for (int i = 0;  i<amountOfCards; i++){
            Card card = cards.remove(
                    new Random().nextInt(cards.size())
            );
            cardsToReturn.add(card);
        }
        return cardsToReturn;
    }
}
