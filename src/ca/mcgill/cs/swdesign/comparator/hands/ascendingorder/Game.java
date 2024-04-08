package ca.mcgill.cs.swdesign.comparator.hands.ascendingorder;

import java.util.*;

/**
 * compare two hand objects using Comparable interface
 * Compare hands by increasing number of cards in a hand
 * if h1.size > h2.size, return 1
 * if h1.size < h2.size, return -1
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
        System.out.println("----------------------after sorting by ascending order ");
        Collections.sort(g.getAllHands());
        g.printAllHands();






    }




}
