package ca.mcgill.cs.swdesign.unittesting.straightflush;

import java.util.*;

/**
 * chapter 3 exercise 9
 * testing: chapter 5 exercise 8,9,10
 * modified hand class to support poker game
 * ability to compare hands in terms of their strengths as poker hands
 * simplifications:
 * 1) only consider ace-first straights
 * 2) compare only based on poker hand type, without card values
 *
 * once you have a working solution, remove the simplications
 *
 */
public class PokerHand {
    private final List<Card> aCards;
    public PokerHand( Card... pCards)
    {
        assert pCards.length == 5;
        aCards = Arrays.asList(pCards);
        aCards.sort(new Comparator<Card>() {
            @Override
            public int compare(Card pCard1, Card pCard2)
            {
                return pCard1.getRank().compareTo(pCard2.getRank());
            }});
    }

    private boolean isStraightFlush()
    {
        Suit suit  = aCards.get(0).getSuit();
        Rank rank = aCards.get(0).getRank();
        Iterator<Card> iterator = aCards.iterator();
        iterator.next(); //move to the second card

        while( iterator.hasNext() )
        {
            Card card = iterator.next();
            if( card.getSuit() != suit || card.getRank().ordinal() - rank.ordinal() != 1)
            {
                return false;
            }
            rank = card.getRank();
        }
        return true;
    }

}
