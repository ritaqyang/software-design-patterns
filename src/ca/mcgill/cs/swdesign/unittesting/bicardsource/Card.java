package ca.mcgill.cs.swdesign.unittesting.bicardsource;

import java.util.HashMap;

public class Card {
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    public enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS;
    }

    private static final HashMap<Integer, Card> mp = new HashMap<>();

    private Rank aRank;
    private Suit aSuit;

    /**
     * Creates a new card object.
     *
     * @param pRank The rank of the card.
     * @param pSuit The suit of the card.
     * @pre pRank != null
     * @pre pSuit != null
     */
    public Card(Rank pRank, Suit pSuit) {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    /**
     * @return The rank of the card.
     */
    public Rank getRank() {
        return aRank;
    }

    /**
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return aSuit;
    }

    public static Card getCardFromFactory(Rank r , Suit s ){
        int key = r.hashCode() + s.hashCode();
        System.out.println(Suit.DIAMONDS.hashCode() + " " + s.hashCode());
        if (mp.containsKey(key)){
            return mp.get(key);
        }
        else{
            Card c = new Card(r,s);
            mp.put(key,c);
            return c;
        }

    }

    public static void main(String[] args) {
        Card.getCardFromFactory(Rank.FOUR, Suit.CLUBS);
    }
}
