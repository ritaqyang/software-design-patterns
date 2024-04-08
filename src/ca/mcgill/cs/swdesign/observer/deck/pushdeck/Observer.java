package ca.mcgill.cs.swdesign.observer.deck.pushdeck;

public interface Observer {
    void shuffled();
    void cardDrawn(Card c );
    void cardPushed(Card c );
}
