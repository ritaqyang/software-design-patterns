package ca.mcgill.cs.swdesign.unittesting.straightflush;

import java.util.HashMap;

public class Card {


    public static HashMap<Integer,Card> cards = new HashMap<>();

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
    private Card(Rank pRank, Suit pSuit) {
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

    public static Card get(Rank rank, Suit suit){
        int key = rank.hashCode() + suit.hashCode();
        if (cards.containsKey(key)){
            return cards.get(key);
        }
        else{
            Card newCard = new Card(rank, suit);
            cards.put(key, newCard);
            return newCard;
        }
    }
}
