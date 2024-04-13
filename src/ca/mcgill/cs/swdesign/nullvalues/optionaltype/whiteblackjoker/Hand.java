package ca.mcgill.cs.swdesign.nullvalues.optionaltype.whiteblackjoker;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Enhanced hand class that is kept in sorted order
 * using s parameterizable sorting order
 * using Strategy pattern to allow clients to decide how cards should be sorted
 * The cards in the hand should be sorted according to the required order at all times
 */

public class Hand {

    private List<Card> aCards = new ArrayList<>();
    private Comparator<Card> compareMethod = Card.createByRankComparator();


    /**
     * Creates a new, empty hand, which can hold
     * a maximum of pMaxCards. Allows specifying a sorting order
     * other than the default (by rank) order.
     *
     * @param pMaxCards The maximum number of cards allowed in this hand.
     * @pre pMaxCards > 0;
     * @pre pCompareMethod!=null
     */
    public Hand(int pMaxCards, Comparator<Card> pCompareMethod) {
        assert pMaxCards > 0 && pCompareMethod != null;
        generateRandomHand(pMaxCards);
        compareMethod = pCompareMethod;
        aCards.sort(compareMethod); //sort the generated hand of cards according to the sorting method
    }

    public Hand(int pMaxCards){
        assert pMaxCards >0 ;
        generateRandomHand(pMaxCards);
        aCards.sort(compareMethod); //sort the generated hand of cards according to the sorting method
    }

    /**
     * Adds card to this hand and sorts it according to the this hand's sorting method
     * @param c
     * @pre c != null
     */
    public void addCardToHand(Card c ){
        assert c != null;
        this.aCards.add(c);
        aCards.sort(this.compareMethod);
    }

    // Method to generate a random hand of 10 cards
    private void generateRandomHand(int num) {
        Random random = new Random();

        for (int i = 0; i <num; i++) {
            // Generate random rank and suit
            Card.Rank randomRank = Card.Rank.values()[random.nextInt(Card.Rank.values().length)];
            Card.Suit randomSuit = Card.Suit.values()[random.nextInt(Card.Suit.values().length)];

            // Create card and add to hand
            aCards.add(new Card(randomRank, randomSuit));
        }
    }

    @Override
    public String toString()
    {
        StringWriter writer = new StringWriter();
        for( Card card : aCards )
        {
            writer.append(card.toString() + "\n");
        }
        return writer.toString();
    }





}
