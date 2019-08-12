package utilities;

public class Card {
    private CardNaipes naipe;
    private CardValues value;

    public Card(CardNaipes naipe, CardValues value){
        this.naipe = naipe;
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value + " " + naipe;
    }
}
