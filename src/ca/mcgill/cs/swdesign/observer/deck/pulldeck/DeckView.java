package ca.mcgill.cs.swdesign.observer.deck.pulldeck;

import java.util.List;

public interface DeckView {

    List<Card> getCards();
    boolean isEmpty();
    Card getLastDrawn();

    default int size(){return getCards().size();}
}
