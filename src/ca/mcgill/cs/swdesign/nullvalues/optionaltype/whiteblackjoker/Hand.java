package ca.mcgill.cs.swdesign.nullvalues.optionaltype.whiteblackjoker;

import java.io.StringWriter;
import java.util.*;

/**
 *
 * The cards in the hand should be sorted by rank, and sorted at all times
 */

public class Hand {

    private List<Card> aCards = new ArrayList<>();

    public Hand(int pMaxCards){
        assert pMaxCards >0 ;
        generateRandomHand(pMaxCards);
        Collections.sort(aCards);

    }

    public void addCardToHand(Card c ){
        assert c != null;
        this.aCards.add(c);
        Collections.sort(aCards);

    }

    // Method to generate a random hand of 10 cards
    private void generateRandomHand(int num) {
        Random random = new Random();

        for (int i = 0; i <num-2; i++) {
            // Generate random rank and suit
            Card.Rank randomRank = Card.Rank.values()[random.nextInt(Card.Rank.values().length)];
            Card.Suit randomSuit = Card.Suit.values()[random.nextInt(Card.Suit.values().length)];

            // Create card and add to hand
            aCards.add(new Card(randomRank, randomSuit));
        }
        aCards.add(new Card(true));
        aCards.add(new Card(false));

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
