package utilities;
import java.util.ArrayList;
import java.util.List;

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
}
