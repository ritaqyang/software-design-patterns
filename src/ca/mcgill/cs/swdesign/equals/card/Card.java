package ca.mcgill.cs.swdesign.equals.card;

import java.util.Comparator;

public class Card
{
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

    /**
     * @param pRank The index of the rank in RANKS
     * @param pSuit The index of the suit in SUITS
     * @pre pRank != null && pSuit != null
     */
    public Card(Rank pRank, Suit pSuit)
    {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    /**
     * @return The rank of the card.
     */
    public Rank getRank()
    {
        return aRank;
    }

    /**
     * @return The suit of the card.
     */
    public Suit getSuit()
    {
        return aSuit;
    }



    @Override
    public String toString()
    {
        return getRank() + " of " + getSuit();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Card other = (Card) obj;
        return aRank.equals(other.aRank) && aSuit.equals(other.aSuit);
    }

}


