package ca.mcgill.cs.swdesign.comparator.hands.midtermquestion;
public class Card
{
    public enum Rank
    { ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    public enum Suit {CLUBS, DIAMONDS, SPADES, HEARTS }
    private final Rank aRank;
    private final Suit aSuit;
    public Card(Rank pRank, Suit pSuit)
    {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    public Rank getRank() { return aRank;}
    public Suit getSuit() {return aSuit; }


    @Override
    public String toString()
    {
        return getRank() + " of " + getSuit();
    }

}
