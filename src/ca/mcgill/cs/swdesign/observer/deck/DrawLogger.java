package ca.mcgill.cs.swdesign.observer.deck;

/**
 * prints any card that is drawn in deck
 */
public class DrawLogger implements  Observer{

    /**
     *
     */
    @Override
    public void shuffled() {
        //do nothing
    }

    /**
     * @param c
     */
    @Override
    public void cardDrawn(Card c) {
        System.out.println(c + "is drawn");
    }

    /**
     * @param c
     */
    @Override
    public void cardPushed(Card c) {

        // do nothing

    }
}
