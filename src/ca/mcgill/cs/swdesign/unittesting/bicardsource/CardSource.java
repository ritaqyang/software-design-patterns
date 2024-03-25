package ca.mcgill.cs.swdesign.unittesting.bicardsource;

public interface CardSource {
    static CardSource NULL = new CardSource()
    {
        public boolean isEmpty()
        {
            return true;
        }

        public Card draw()
        {
            assert !isEmpty();
            return null;
        }

        public boolean isNull()
        {
            return true;
        }
    };

    /**
     * Returns a card from the source.
     *
     * @return The next available card.
     * @pre !isEmpty()
     */
    Card draw();

    /**
     * @return True if there is no card in the source.
     */
    boolean isEmpty();

    /**
     * @return True if this instance is a null card source.
     */
    default boolean isNull()
    {
        return false;
    }

}
