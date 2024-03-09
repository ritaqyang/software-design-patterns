package ca.mcgill.cs.swdesign.flyweight.coffeeshop;

//todo: client code
public class Shop {

    private final CoffeeFlavourFactory aFactory = new CoffeeFlavourFactory();

    public void takeOrder(String flavourName, int tableNumber){
        CoffeeFlavour currentFlavour = aFactory.getCoffeeFlavour(flavourName);
        currentFlavour.serveCoffee(new CoffeeOrderContext(tableNumber));
    }

    public int getTotalFlavours(){
        return aFactory.getTotalFlavours();
    }

    public static void main(String[] args){

        Shop SecondCup = new Shop();

        SecondCup.takeOrder("Cappuccino", 1);
        SecondCup.takeOrder("Cappuccino", 1);
        SecondCup.takeOrder("Espresso", 2);
        SecondCup.takeOrder("Cappuccino", 3);
        SecondCup.takeOrder("Frappe", 4);
        SecondCup.takeOrder("Espresso", 5);
        SecondCup.takeOrder("Cappuccino", 6);
        SecondCup.takeOrder("Frappe", 7);

        System.out.println("Total flavours:" + SecondCup.getTotalFlavours());
    }


}
