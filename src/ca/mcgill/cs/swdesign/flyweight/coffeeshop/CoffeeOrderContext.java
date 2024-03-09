package ca.mcgill.cs.swdesign.flyweight.coffeeshop;

class CoffeeOrderContext {
    private final int aTableNumber;

    public CoffeeOrderContext(int pTableNumber) {
        aTableNumber = pTableNumber;
    }

    public int getTableNumber() {
        return aTableNumber;
    }
}