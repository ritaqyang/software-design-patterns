package ca.mcgill.cs.swdesign.observer.pushdeck;

public class Card {
    public Card(Rank aRank, Suit aSuit) {
        this.aRank = aRank;
        this.aSuit = aSuit;
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    /**
     * A card's suit.
     */
    public enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    private final Rank aRank;
    private final Suit aSuit;
}
