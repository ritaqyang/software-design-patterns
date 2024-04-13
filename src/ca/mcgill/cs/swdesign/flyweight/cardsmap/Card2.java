package ca.mcgill.cs.swdesign.flyweight.cardsmap;

import java.util.HashMap;

/**
 * Chapter 4 Exercise 10
 * implement flyweight design pattern
 * so that card objects that exist are unique instances
 * lazily create the card flyweights
 */
public class Card2 {

    //Flyweight store
    private static final HashMap<Integer, Card2> mp = new HashMap<>();

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
        if (mp.containsKey(pRank.hashCode() + pSuit.hashCode())){
            return mp.get(pRank.hashCode() + pSuit.hashCode());
        }
        else{
            Card2 newcard = new Card2(pRank, pSuit);
            mp.put(pRank.hashCode() + pSuit.hashCode(), newcard);
            return newcard;
        }
    }


}
