package ca.mcgill.cs.swdesign.flyweight.cards;

import java.util.ArrayList;

/**
 * Chapter 4 Exercise 9
 * implement flyweight design pattern
 * so that card objects that exist are unique instances
 * use pre-initialization strategy
 */
public class Card {

    //Flyweight store
    private static final Card[][] CARDS = new Card[Suit.values().length][Rank.values().length];

    private final Rank aRank;
    private final Suit aSuit;

    // Initialization of the flyweight store
    static
    {
        for( Suit suit : Suit.values() )
        {
            for( Rank rank : Rank.values() )
            {
                CARDS[suit.ordinal()][rank.ordinal()] = new Card(rank, suit);
            }
        }
    }


    public Card(Rank aRank, Suit aSuit) {
        this.aRank = aRank;
        this.aSuit = aSuit;
    }

    public enum Rank
    { ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit
    {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    public static Card getCard(Rank pRank, Suit pSuit){
        assert pRank != null && pSuit != null;
        return CARDS[pSuit.ordinal()][pRank.ordinal()];
    }


}
