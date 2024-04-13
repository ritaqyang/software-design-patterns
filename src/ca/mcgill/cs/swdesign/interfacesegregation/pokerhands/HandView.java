package ca.mcgill.cs.swdesign.interfacesegregation.pokerhands;

import java.util.Iterator;

public interface HandView extends Iterable<Card> {
    boolean containsCard(Card c);
    boolean isEmpty();
    Iterator<Card> iterator();


}
