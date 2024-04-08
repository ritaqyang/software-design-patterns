package ca.mcgill.cs.swdesign.comparator.hands.singleorder;

import java.io.StringWriter;
import java.util.*;

public class Hand implements Comparable<Hand> {

    private List<Card> aCards = new ArrayList<>();
    public Hand(int num) {
        generateRandomHand(num);
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


    @Override
    public int compareTo(Hand h2) {
        return this.aCards.size() - h2.aCards.size();
    }

    public int compareToWrittenOut(Hand h2) {
        if (this.aCards.size() > h2.aCards.size()) {
            return 1;
        } else if (this.aCards.size() < h2.aCards.size()) {
            return -1;
        } else {
            return 0;
        }
    }
}
