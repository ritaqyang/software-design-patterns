package ca.mcgill.cs.swdesign.liskov.deck;

import ca.mcgill.cs.swdesign.interfacesegregation.pokerhands.Card;

import java.util.Stack;

public class CardStack {

    private final Stack<Card> cards = new Stack<>();

    protected Card pop(){
        return cards.pop();
    }

    protected Card push(Card c ){
        return cards.push(c);
    }

    protected int size(){ return cards.size(); }
}
