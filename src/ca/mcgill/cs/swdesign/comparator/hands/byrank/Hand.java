package ca.mcgill.cs.swdesign.comparator.hands.byrank;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * create static factory method that takes Rank as a parameter
 * create comparator that can compare number of cards of ca certain rank
 * one ace comes before 3 aces for example
 */
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

    public static Comparator<Hand> createByRankComparator(Card.Rank rankToCompare ){
        return new Comparator<Hand>() {
            @Override
            public int compare(Hand o1, Hand o2) {
                //should return: o1.number of kings - o2.number of kings
                return countByRank(o1, rankToCompare) -countByRank(o2, rankToCompare);
            }

            private int countByRank(Hand h, Card.Rank r){
                int count = 0;
                for (Card c : h.aCards){
                    if (c.getRank() == r ){
                        count++;
                    }
                }
                return count;
            }
        };
    }


}
