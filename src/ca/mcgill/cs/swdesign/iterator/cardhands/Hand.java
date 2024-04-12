package ca.mcgill.cs.swdesign.iterator.cardhands;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Hand {

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

    public static Comparator<Hand> createIncrementComparator(){
        return new Comparator<Hand>() {
            @Override
            public int compare(Hand o1, Hand o2) {
                return o1.aCards.size() - o2.aCards.size();
            }
        };
    }

    public static Comparator<Hand> createDescendingComparator(){
        return new Comparator<Hand>() {
            @Override
            public int compare(Hand o1, Hand o2) {
                return o2.aCards.size() - o1.aCards.size();
            }
        };
    }





}
