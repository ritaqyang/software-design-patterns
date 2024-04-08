package ca.mcgill.cs.swdesign.observer.deck.subclass;

/**
 * prints the size of the deck whenever it changes
 * case 1: card drawn
 * case 2: card pushed
 * case 3: card shuffled
 */
public class SizeStatus implements Observer {


    private int aSize = -1;
    @Override
    public void shuffled() {
        aSize = 52;
        System.out.println("Just shuffled, current size is " +aSize);
    }

    /**
     * @param c
     */
    @Override
    public void cardDrawn(Card c) {
        if (aSize >= 0 ){
            aSize--;
            System.out.println(c + " was drawn, current size is: " + aSize);
        }
        else{
            System.out.println("Attempted to draw card:" + c + "but deck size < 0 ");
        }

    }

    /**
     * @param c
     */
    @Override
    public void cardPushed(Card c) {
        if( aSize >=0 )
        {
            aSize++;
            System.out.println(c +" was pushed, current size: "+ aSize);
        }
        else
        {
            System.out.println("Size unknown");
        }

    }
}
