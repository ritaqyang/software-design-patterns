package ca.mcgill.cs.swdesign.nullvalues.optionaltype.whiteblackjoker;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck
{
    private List<Card> aCards = new ArrayList<>();
    public Deck(Deck pDeck) //copy constructor
    {
        assert pDeck!= null;
        for(Card card : pDeck.aCards)
        {
            aCards.add(card);
        }
    }
    public List<Card> getCards()
    {
        return Collections.unmodifiableList(aCards);
    }
    public Deck()
    {
        shuffle();
    }
    public boolean isEmpty()
    {
        return aCards.isEmpty();
    }
    public Card draw()
    {
        assert !isEmpty();
        return aCards.remove(aCards.size()-1);
    }
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
        aCards.add(new Card(true));
        aCards.add(new Card(false));
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
}
