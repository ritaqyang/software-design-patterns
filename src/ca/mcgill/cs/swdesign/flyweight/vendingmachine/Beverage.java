package ca.mcgill.cs.swdesign.flyweight.vendingmachine;
/**
 * TODO: implement instances of Beverage class => flyweight objects
 * assume that the price of an item can be obtained through static call:
 *  Catalog.getPrice(String name)
 */
public class Beverage {

    private final String aName; //assume unique in the software
    private int aPrice;

    public Beverage(String pname, int pprice) {
        this.aName = pname;
        this.aPrice = pprice;
    }
}
