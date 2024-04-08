package ca.mcgill.cs.swdesign.observer.pulldeck;

/**
 * prints any card that is drawn in deck
 */
public class DrawLogger implements Observer {

    /**
     *
     */
    @Override
    public void shuffled(DeckView d) {
        //do nothing
    }

    /**
     * @param c
     */
    @Override
    public void cardDrawn(DeckView d) {
        System.out.println(d.getLastDrawn() + "is drawn");

    }

    /**
     * @param c
     */
    @Override
    public void cardPushed(DeckView d) {

        // do nothing

    }
}
