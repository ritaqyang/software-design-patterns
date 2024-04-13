package ca.mcgill.cs.swdesign.nullvalues.optionaltype.whiteblackjoker;

import java.util.Comparator;
import java.util.Optional;

/**
 * chapter 4 exercise 5
 * changing the card design to include white and black jokers
 * use optional type to return the rank and suit of the cards
 * white joker comes after any cards, black comes after white
 * any card < white < black
 * white and black joker doesn't have rank and suit
 */
public class Card implements Comparable<Card>
{
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

    private enum Joker{WHITE, BLACK}

    private final Optional<Rank> aRank;
    private final Optional<Suit> aSuit;
    private final Optional<Joker> aJoker;

    /**
     * @param pRank The index of the rank in RANKS
     * @param pSuit The index of the suit in SUITS
     * @pre pRank != null && pSuit != null
     */
    public Card(Rank pRank, Suit pSuit)
    {
        assert pRank != null && pSuit != null;
        aRank = Optional.of(pRank);
        aSuit = Optional.of(pSuit);
        aJoker = Optional.empty();
    }

    /**
     * constructor for a joker card
     * @param pIsWhite a boolean value indicating the color of the joker
     */
    public Card(boolean pIsWhite)
    {
        aRank = Optional.empty();
        aSuit = Optional.empty();
        if( pIsWhite )
        {
            aJoker = Optional.of(Joker.WHITE);
        }
        else
        {
            aJoker = Optional.of(Joker.BLACK);
        }
    }

    public boolean isJoker()
    {
        return aJoker.isPresent();
    }

    public boolean isWhiteJoker()
    {
        return aJoker.isPresent() && aJoker.get() == Joker.WHITE;
    }

    public boolean isBlackJoker()
    {
        return aJoker.isPresent() && aJoker.get() == Joker.BLACK;
    }

    /**

    /**
     * @return The rank of the card.
     */
    public Rank getRank()
    {
        return aRank.get();
    }

    /**
     * @return The suit of the card.
     */
    public Suit getSuit()
    {
        return aSuit.get();
    }


    @Override
    public int compareTo(Card pCard)
    {
        assert pCard!=null;
        if( isJoker() && pCard.isJoker() )
        {
            return aJoker.get().compareTo(pCard.aJoker.get());
        }
        else if( isJoker() && !pCard.isJoker())
        {
            return 1;
        }
        else if( !isJoker() && pCard.isJoker() )
        {
            return -1;
        }
        else
        {
            return aRank.get().compareTo(pCard.aRank.get());
        }
    }


    @Override
    public String toString()
    {
        return getRank() + " of " + getSuit();
    }

}
