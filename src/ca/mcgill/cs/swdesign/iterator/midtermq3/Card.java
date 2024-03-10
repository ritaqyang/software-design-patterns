package ca.mcgill.cs.swdesign.iterator.midtermq3;


import java.util.Iterator;
import java.util.List;

public class Card {

    public Card(Rank aRank, Suit aSuit) {
        this.aRank = aRank;
        this.aSuit = aSuit;
    }

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

    public Rank getRank() {
        return aRank;
    }

    public static int countAces(List<Card> pCards) {
        int total = 0;
        for (Card card : pCards) {
            if (card.getRank() == Rank.ACE) {
                total++;
            }
        }
        return total;
    }

    public static int countAcesExplicit(List<Card> pCards) {
        int total = 0;
        Iterator<Card> iterator = pCards.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            if (card.getRank() == Rank.ACE) {
                total++;
            }
        }
        return total;
    }
}