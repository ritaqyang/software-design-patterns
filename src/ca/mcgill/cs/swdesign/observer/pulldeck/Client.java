package ca.mcgill.cs.swdesign.observer.pulldeck;

public class Client {

    public static void main(String[] args){
        ObservableDeck deck = new ObservableDeck();
        deck.addObserver(new SizeStatus());
        deck.addObserver(new DrawLogger());

        deck.shuffle();
        deck.draw();

    }
}
