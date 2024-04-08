package ca.mcgill.cs.swdesign.observer.pulldeck;

/**
 * prints the size of the deck whenever it changes
 * case 1: card drawn
 * case 2: card pushed
 * case 3: card shuffled
 */
public class SizeStatus implements Observer {

    @Override
    public void shuffled(DeckView d) {
        System.out.println("Just shuffled, current size is " +d.size());
    }
    @Override
    public void cardDrawn(DeckView d) {

            System.out.println(d.getLastDrawn() + " was drawn, current size is: " + d.size());

    }
    @Override
    public void cardPushed(DeckView d) {
       System.out.println(d.size());
    }
}
