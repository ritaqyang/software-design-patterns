package ca.mcgill.cs.swdesign.comparator.hands.twodirection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * compare two hand objects using Comparable interface
 * Compare hands by increasing or decreasing number of cards in a hand
 * two different comparison strategies
 * define static factory methods in Hand class to return anonymous instances of comparators
 * for the different comparison strategies
 */
public class Game
{

    private  List<Hand> allHands = new ArrayList<>();

    public List<Hand> getAllHands() {
        return allHands;
    }

    public void setAllHands(List<Hand> allHands) {
        this.allHands = allHands;
    }

    public void printAllHands(){
        for (Hand h : allHands){
            System.out.println(h);
        }
    }
    public static void main(String[] args){
        Hand hand1 = new Hand(4);
        Hand hand2 = new Hand(15);
        Hand hand3 = new Hand(8);
        Hand hand4 = new Hand(9);

        Game g = new Game();
        g.setAllHands( Arrays.asList(hand1,hand2,hand3,hand4));

        System.out.println("----------------------before sorting");
        g.printAllHands();
        System.out.println("----------------------after sorting by descending order ");
        Collections.sort(g.getAllHands(), Hand.createDescendingComparator());
        g.printAllHands();






    }




}
