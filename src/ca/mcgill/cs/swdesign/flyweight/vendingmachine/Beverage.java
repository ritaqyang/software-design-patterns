package ca.mcgill.cs.swdesign.flyweight.vendingmachine;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO: implement instances of Beverage class => flyweight objects
 * all required implementation is localized in the Beverage class
 * assume that the price of an item can be obtained through static call:
 *  Catalog.getPrice(String name)
 */

public class Beverage {
    //  flyweight factory
    private static final Map<String, Beverage> beverages = new HashMap<>();

    private final String name;
    private final int price;

    private Beverage(String pName) {
        this.name = pName;
        this.price = Catalog.getPrice(pName);
    }

    // Factory method to get or create flyweight instances
    public static Beverage getBeverage(String name) {
        return beverages.computeIfAbsent(name, t -> new Beverage(name));
    }

}
