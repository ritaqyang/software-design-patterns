package ca.mcgill.cs.swdesign.flyweight.coffeeshop;

import java.util.HashMap;
import java.util.Map;

//todo: Flyweight Factory
public class CoffeeFlavourFactory {

    private final Map<String, CoffeeFlavour> aFlavours = new HashMap<>();
    public CoffeeFlavour getCoffeeFlavour(String flavourName){
        return aFlavours.computeIfAbsent(flavourName, CoffeeFlavour::new);
        //(flavourName, key -> new CoffeeFlavour(key));

    }
    public int getTotalFlavours(){return aFlavours.size(); }

}
