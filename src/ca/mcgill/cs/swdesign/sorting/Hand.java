package ca.mcgill.cs.swdesign.sorting;
import java.io.StringWriter;
import java.util.*;
import ca.mcgill.cs.swdesign.sorting.Card.Rank;
import ca.mcgill.cs.swdesign.sorting.Card.Suit;
/** todo:  winter 2016 midterm question

Objects of class Hand aggregate exactly 10 objects of class card.
implement the mechanism necessary to support sorting hands using the Arrays.sort function of the JDK

Hands should be ordered in terms of cards of a certain rank.
Clients should be able to compare hands by number of aces, number of kings, or number of fours, etc.
If a client chooses to compare hands by number of aces, one ace should come before a hand with 2 aces.
If two hands have the same number of aces, they are equal. Same logic applies to any rank

todo: your solution should include the strategy design pattern and an object factory method


 */
public class Hand implements Iterable<Card>, Comparable<Hand> {

    private Card[] aCards = new Card[10]; //if arraylist can use default iterator
    //assume the cards are initialized somehow, you don't have to provide code to do this

    public Hand() {
        generateRandomHand();
    }

    // Method to generate a random hand of 10 cards
    private void generateRandomHand() {
        Random random = new Random();

        for (int i = 0; i < aCards.length; i++) {
            // Generate random rank and suit
            Card.Rank randomRank = Card.Rank.values()[random.nextInt(Card.Rank.values().length)];
            Card.Suit randomSuit = Card.Suit.values()[random.nextInt(Card.Suit.values().length)];

            // Create card and add to hand
            aCards[i] = new Card(randomRank, randomSuit);
        }
    }

    public static Comparator<Hand> createByRankComparator(Card.Rank rank) {
        return new Comparator<Hand>() {
            @Override
            public int compare(Hand hand1, Hand hand2) {
                int rankCountHand1 = countRank(hand1.getCards(), rank);
                int rankCountHand2 = countRank(hand2.getCards(), rank);

                if (rankCountHand1 == rankCountHand2) {
                    return 0; // Hands are equal in terms of the specified rank
                } else {
                    return Integer.compare(rankCountHand1, rankCountHand2);
                }
            }

            private int countRank(Card[] cards, Card.Rank rank) {
                int count = 0;
                for (Card card : cards) {
                    if (card.getRank() == rank) {
                        count++;
                    }
                }
                return count;
            }
        };
    }


    public Card[] getCards() {
        return aCards;

    }
    // Implement Iterable interface
    @Override
    public Iterator<Card> iterator() {
        return new Iterator<Card>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < aCards.length;
            }
            @Override
            public Card next() {
                return aCards[index++];
            }
        };
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
    public int compareTo(Hand o) {
        return 0;
    }
}
