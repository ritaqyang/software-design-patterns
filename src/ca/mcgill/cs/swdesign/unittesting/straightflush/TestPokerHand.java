package ca.mcgill.cs.swdesign.unittesting.straightflush;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

/**
 * testing suite for PokerHand
 */
public class TestPokerHand{


    /**
     * helper method to invoke private method isStraightFlush in PokerHand class
     * @return whether if its a straight flush
     */
    private boolean invokeIsStraightFlush(PokerHand pokerhand )  {
        try{
            Method m = PokerHand.class.getDeclaredMethod("isStraightFlush");
            m.setAccessible(true);
            return (boolean) m.invoke(pokerhand);
        } catch (ReflectiveOperationException e) {
            fail();
        }
        return false;
    }
    @Test
    public void testIsStraightFlush_True(){
        PokerHand h = new PokerHand(
                Card.get(Rank.ACE, Suit.CLUBS),
                Card.get(Rank.TWO, Suit.CLUBS),
                Card.get(Rank.THREE, Suit.CLUBS),
                Card.get(Rank.FOUR, Suit.CLUBS),
                Card.get(Rank.FIVE, Suit.CLUBS));
        assertTrue( invokeIsStraightFlush(h));

    }
    @Test
    public void testIsStraightFlush_WrongSuit(){
        PokerHand h = new PokerHand(
                Card.get(Rank.ACE, Suit.CLUBS),
                Card.get(Rank.TWO, Suit.CLUBS),
                Card.get(Rank.THREE, Suit.CLUBS),
                Card.get(Rank.FOUR, Suit.CLUBS),
                Card.get(Rank.FIVE, Suit.DIAMONDS));
        assertFalse(invokeIsStraightFlush(h));

    }
    @Test
    public void testIsStraightFlush_WrongRank(){
        PokerHand h = new PokerHand(
                Card.get(Rank.ACE, Suit.CLUBS),
                Card.get(Rank.TWO, Suit.CLUBS),
                Card.get(Rank.THREE, Suit.CLUBS),
                Card.get(Rank.FOUR, Suit.CLUBS),
                Card.get(Rank.FOUR, Suit.CLUBS));
        assertFalse(invokeIsStraightFlush(h));

    }



}