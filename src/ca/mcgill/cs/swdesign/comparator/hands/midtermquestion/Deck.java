package ca.mcgill.cs.swdesign.comparator.hands.midtermquestion;
import java.io.StringWriter;
import java.util.*;

public class Deck implements Iterable<Card>
{
    private List<Card> aCards = new ArrayList<>();
    public Deck(Deck pDeck)
    {
        assert pDeck!= null;
        for(Card card : pDeck.aCards)
        {
            aCards.add(card);
        }
    }

    /**
     * @return An unmodifiable list of all the cards in the deck.
     * other option is to return a copy of aCards
     * Shallow copy is fine because cards are immutable
     */
    public List<Card> getCards()
    {
        return Collections.unmodifiableList(aCards);
    }

    public List<Card> getCards2() {return new ArrayList<>(aCards); }

    /**
     * 	Creates a new deck of 52 cards, shuffled.
     */
    public Deck()
    {
        shuffle();
    }

    /**
     * @return True if and only if there are no cards in the deck.
     */
    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }

    /**
     *  Draw a card from the top of the Deck if it is not empty.
     * @return The card drawn
     * @pre !isEmpty()
     */
    public Card draw()
    {
        assert !isEmpty();
        return aCards.remove(aCards.size()-1);
    }

    /**
     * Reinitialize the deck with all 52 cards and shuffles them.
     */
    public void shuffle()
    {
        aCards.clear();
        for(Card.Suit suit : Card.Suit.values() )
        {
            for( Card.Rank rank : Card.Rank.values())
            {
                aCards.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(aCards);
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
    public Iterator<Card> iterator() {
        return aCards.iterator();
    }

    /**
     * Sort the card in the deck with the provided comparator
     * @param pComparator the comparator which defines the sorting behavior
     * @pre pComparator!=null;
     */
    public void sort(Comparator<Card> pComparator){
        assert pComparator!=null;
        Collections.sort(aCards, pComparator);
    }
}
