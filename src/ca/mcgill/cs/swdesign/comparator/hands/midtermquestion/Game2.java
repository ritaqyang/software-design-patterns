package ca.mcgill.cs.swdesign.comparator.hands.midtermquestion;

import java.util.Arrays;
import java.util.Iterator;

public class Game2
{
    private Hand[] hands = new Hand[8];

    public Game2()
    {

        for (int i = 0; i < 8; i++){
            hands[i] = new Hand();
            System.out.println(hands[i]);
        }

        System.out.println("--------------Initialized  8 complete hands of 10 cards --------------");

        Arrays.sort(hands, Hand.createByRankComparator(Card.Rank.THREE));

        System.out.println("--------------After Sorting--------------");

        for (int i = 0; i < 8; i++){
            System.out.println(hands[i]);
        }



    }

    public static void main(String[] args)
    {


        new Game2();
        //use iterator
        Hand hand = new Hand();
        Iterator<Card> cardIterator = hand.iterator();
        while (cardIterator.hasNext()){
            Card c = cardIterator.next();
            System.out.print(c);
        }
    }


}
