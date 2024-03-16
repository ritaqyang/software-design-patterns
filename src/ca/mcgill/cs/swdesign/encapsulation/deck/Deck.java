package ca.mcgill.cs.swdesign.encapsulation.deck;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Deck {
    private List<Card> aCards = new ArrayList<>();

    /**
     * red flag
     * @return a reference to an internal object - bad
     */
    public List<Card> getCards(){
        return aCards;
    }

    /**
     *
     * @param pCards
     * red flag: leaking references through shared structures
     */

    public void collect(List<Card> pCards){
        pCards.addAll(aCards);
    }
}
