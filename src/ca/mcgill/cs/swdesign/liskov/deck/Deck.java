package ca.mcgill.cs.swdesign.liskov.deck;

import ca.mcgill.cs.swdesign.interfacesegregation.pokerhands.Card;

/**
 * put only generic methods
 * Liskov principle:
 * If S is a subtype of T, then all objects of T can be replaced with S
 * without altering
 * S can sub T
 *
 */

public class Deck {

    protected final CardStack aCard = new CardStack();

    /**
     * @pre aCard.size() >= 1
     * @return
     */
    public Card draw() {
        assert aCard.size() >= 1;
        return aCard.pop();
    }

}

