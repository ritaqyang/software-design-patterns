package ca.mcgill.cs.swdesign.interfacesegregation.pokerhands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        Hand hand1 = new Hand(15, Card.createBySuitComparator());
        Hand hand2 = new Hand(15, Card.createBySuitComparator());
        Hand hand3 = new Hand(8);
        Hand hand4 = new Hand(9);

        Game g = new Game();
        g.setAllHands( Arrays.asList(hand1,hand2,hand3,hand4));

        System.out.println("printing all hands, first two sorted by suit, second 2 sorted by rank ");
        g.printAllHands();





    }




}
