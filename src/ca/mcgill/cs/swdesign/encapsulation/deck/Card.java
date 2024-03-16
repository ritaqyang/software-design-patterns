package ca.mcgill.cs.swdesign.encapsulation.deck;

import lombok.Data;

@Data
public class Card {
    public enum Rank
    { ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    /**
     * A card's suit.
     */
    public enum Suit
    {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    private final Rank aRank;
    private final Suit aSuit;
}
