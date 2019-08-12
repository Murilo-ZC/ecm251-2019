package com.company;

import utilities.Card;
import utilities.Deck;

public class Main {

    public static void main(String[] args) {
	    Deck deck;
	    deck = new Deck();

	    for (Card card : deck.showCards()){
            System.out.println("Card: " + card);
        }
    }
}
