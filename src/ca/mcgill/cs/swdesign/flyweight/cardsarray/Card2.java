package ca.mcgill.cs.swdesign.flyweight.cardsarray;

/**
 * Chapter 4 Exercise 10
 * implement flyweight design pattern
 * so that card objects that exist are unique instances
 * lazily create the card flyweights
 */
public class Card2 {

    //Flyweight store
    private static final Card2[][] CARDS = new Card2[Suit.values().length][Rank.values().length];

    private final Rank aRank;
    private final Suit aSuit;


    public Card2(Rank aRank, Suit aSuit) {
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

    public static Card2 getCard(Rank pRank, Suit pSuit){
        assert pRank != null && pSuit != null;
        //return instance if it exists

        Card2 card = CARDS[pSuit.ordinal()][pRank.ordinal()];
        if (card == null) {
            //make new card
            card = new Card2(pRank, pSuit);
            CARDS[pSuit.ordinal()][pRank.ordinal()] =card;

        }

        return card;
    }


}
