package ca.mcgill.cs.swdesign.flyweight.coffeeshop;

//concrete flyweight

public class CoffeeFlavour implements CoffeeOrder{
    private final String aFlavour;
    public CoffeeFlavour(String pFlavour){
        aFlavour = pFlavour;
    }



    @Override
    public void serveCoffee(CoffeeOrderContext context) {
        System.out.println("Serving " + aFlavour + "to table " + context.getTableNumber());
    }
}
