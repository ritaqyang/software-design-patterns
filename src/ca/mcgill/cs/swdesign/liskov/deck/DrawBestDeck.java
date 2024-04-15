package ca.mcgill.cs.swdesign.liskov.deck;
import ca.mcgill.cs.swdesign.interfacesegregation.pokerhands.Card;

public class DrawBestDeck extends Deck {


    /**
     * when overriding in subtype
     * cannot have stricter preconditions
     * cannot have less strict postconditions
     * cannot take more specific types as params
     * cannot have a less specific return type
     * cannot make the method less accessible
     * cannot throw new exceptions
     *
     *
     */


    /**
     * @pre aCard.size() >=2 (Stricter than parent)
     * therefore violates liskov
     * @return
     */
    @Override
    public Card draw(){
        assert (aCard.size() >= 2);
        Card card1 = aCard.pop();
        Card card2 = aCard.pop();
        if (card1.compareTo(card2) > 0 ){
            aCard.push(card2);
            return card2;
        }
        return card1;
    }


}
