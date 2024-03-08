package ca.mcgill.cs.swdesign.flyweight.vendingmachine;

public class Beverage {

    private final String aName;
    private int aPrice;

    public Beverage(String pname, int pprice) {
        this.aName = pname;
        this.aPrice = pprice;
    }
}
