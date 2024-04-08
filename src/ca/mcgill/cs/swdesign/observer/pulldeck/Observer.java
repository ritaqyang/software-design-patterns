package ca.mcgill.cs.swdesign.observer.pulldeck;

public interface Observer {
    void shuffled(DeckView d );
    void cardDrawn(DeckView d );
    void cardPushed(DeckView d);
}
