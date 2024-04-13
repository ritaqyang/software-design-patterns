package ca.mcgill.cs.swdesign.unittesting.bicardsource;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test suite for BiCardSource
 * covers all public methods, achieving 100% branch coverage
 * use stubs to help isolate the behavior to test
 */
public class BiCardSourceTest {

    private static final Card DIAMOND = Card.getCardFromFactory(Card.Rank.FIVE, Card.Suit.DIAMONDS);
    private static final Card CLUB = Card.getCardFromFactory(Card.Rank.FIVE, Card.Suit.CLUBS);

    private CardSource emptyCS = new CardSourceStub();
    private CardSource diamondCS = new CardSourceStub(DIAMOND);
    private CardSource clubCS = new CardSourceStub(CLUB);


    /**
     * this stub takes either no card or a single card
     * represents CardSource
     * single card is used to verify which cardsource this stub is
     */
    private static class CardSourceStub implements CardSource{

        private Optional<Card> aCard = Optional.empty();

        CardSourceStub(){};
        CardSourceStub(Card pCard){
            aCard = Optional.of(pCard);
        }

        @Override
        public Card draw() {
            assert !isEmpty();
            Card c = aCard.get();
            aCard = Optional.empty();
            return c;
        }

        @Override
        public boolean isEmpty() {
            return !aCard.isPresent();
        }
    }

    @Test
    public void testisEmpty_False_FirstEmpty(){

        BiCardSource b = new BiCardSource(emptyCS, clubCS);
        assertFalse(b.isEmpty());

    }
    @Test
    public void testisEmpty_False_SecondEmpty(){

        BiCardSource b = new BiCardSource( clubCS, emptyCS);
        assertFalse(b.isEmpty());

    }
    @Test
    public void testisEmpty_False_NeitherEmpty(){

        BiCardSource b = new BiCardSource(diamondCS, clubCS);
        assertFalse(b.isEmpty());

    }

    @Test
    public void testisEmpty_True_BothEmpty(){
        BiCardSource b = new BiCardSource(emptyCS, emptyCS);
        assertTrue(b.isEmpty());
    }
    @Test
    public void testDraw_SourceOneNotEmpty(){
        BiCardSource b = new BiCardSource(diamondCS, clubCS);
        assertSame(DIAMOND, b.draw());

    }

    @Test
    public void testDraw_SourceOneEmpty(){
        BiCardSource b = new BiCardSource(emptyCS, clubCS);
        assertSame(CLUB, b.draw());
    }

    @Test
    public void testDraw_BothSourceNotEmpty(){
        BiCardSource b = new BiCardSource(clubCS, diamondCS);
        assertSame(CLUB, b.draw());
    }



}
