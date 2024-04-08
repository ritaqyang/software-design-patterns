package ca.mcgill.cs.swdesign.observer.deck.subclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * a subclass of Deck
 */
public class ObservableDeck extends Deck
{
    private final List<Observer> deckObservers = new ArrayList<>();//new field
    public void addObserver(Observer o)
    {
        assert o != null;
        deckObservers.add(o);
    }
    public void shuffle()
    {
        super.shuffle();
        for (Observer o : deckObservers){
            o.shuffled(); // notify all observers of this deck
        }
    }

    public void push(Card pCard)
    {
        super.push(pCard);
        for (Observer o : deckObservers){
            o.cardPushed(pCard); // notify all observers of this deck
        }
    }
    public Card draw()
    {
        Card c = super.draw();
        for (Observer o : deckObservers){
            o.cardDrawn(c); // notify all observers of this deck
        }
        return c;
    }

}


