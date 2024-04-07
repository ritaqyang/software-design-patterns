package ca.mcgill.cs.swdesign.observer.deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of playing cards. In this version, the cards in the
 * deck are stored in a list and the list of cards in the deck can
 * be obtained by client code using an immutable wrapper object.
 */
public class ObservableDeck
{
    private List<Card> aCards = new ArrayList<>();
    private final List<Observer> deckObservers = new ArrayList<>();

    /**
     * Creates a new deck of 52 cards, shuffled.
     */
    public ObservableDeck()
    {
        shuffle();
    }

    public void addObserver(Observer o)
    {
        assert o != null;
        deckObservers.add(o);
    }

    /**
     * Reinitializes the deck with all 52 cards, and shuffles them.
     */
    public void shuffle()
    {
        aCards.clear();
        for( Card.Suit suit : Card.Suit.values() )
        {
            for( Card.Rank rank : Card.Rank.values() )
            {
                aCards.add( new Card( rank, suit ));
            }
        }
        Collections.shuffle(aCards);
        for (Observer o : deckObservers){
            o.shuffled(); // notify all observers of this deck
        }

    }

    /**
     * Places pCard on top of the deck.
     * @param pCard The card to place on top
     * of the deck.
     * @pre pCard !=null
     */
    public void push(Card pCard)
    {
        assert pCard != null;
        aCards.add(pCard);
        for (Observer o : deckObservers){
            o.cardPushed(pCard); // notify all observers of this deck
        }
    }

    /**
     * Draws a card from the deck: removes the card from the top
     * of the deck and returns it.
     * @return The card drawn.
     * @pre !isEmpty()
     */
    public Card draw()
    {
        assert !isEmpty();
        Card c =  aCards.remove(aCards.size() - 1);
        for (Observer o : deckObservers){
            o.cardDrawn(c); // notify all observers of this deck
        }
        return c;
    }

    /**
     * @return True if and only if there are no cards in the deck.
     */
    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }

    /**
     * @return An unmodifiable list of all the cards in the deck.
     */
    public List<Card> getCards()
    {
        return Collections.unmodifiableList(aCards);
    }
}


