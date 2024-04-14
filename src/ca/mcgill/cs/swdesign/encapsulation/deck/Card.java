package ca.mcgill.cs.swdesign.encapsulation.deck;

import lombok.Data;

@Data
public class Card {
    public enum Rank
    { ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    /**
     * A card's suit.
     */
    public enum Suit
    {
        CLUBS(Color.BLACK), DIAMONDS(Color.RED), SPADES(Color.BLACK), HEARTS(Color.RED);
        private Color aColor;
        public enum Color {BLACK, RED}
        Suit(Color c){ aColor = c; } //implicit private access
        public Color getColor(){ return aColor; }
    }

    private final Rank aRank;
    private final Suit aSuit;
}
