package ca.mcgill.cs.swdesign.observer.pushdeck;

public interface Observer {
    void shuffled();
    void cardDrawn(Card c );
    void cardPushed(Card c );
}
