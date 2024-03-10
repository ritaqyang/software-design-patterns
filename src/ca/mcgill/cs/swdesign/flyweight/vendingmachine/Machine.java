package ca.mcgill.cs.swdesign.flyweight.vendingmachine;

/**
 *
 * c) The machine works as follows:
 * • select(name) selects a beverage. The selection times out after 30 seconds of inactivity.
 * • pay(amount) adds a number of cents into the machine in one atomic operation.
 * This amount may be inferior, equal, or superior to the price of the selection.
 * It is not possible to pay an amount if there is no currently selected drink.
 *  If the amount paid is inferior to the price of the selected beverage, a balance is accumulated.
 *  If the amount is superior or equal to the price, the beverage is returned, the selection is erased, and any change remaining is returned.
 *  Once a balance exists, it is not possible to change the selection.
 * • reset() erases the selection and returns any balance accumulated.
 * Draw a state diagram that provides an overview of all the necessary abstract states for
 *
 *
 * draw a state diagram
 */

public class Machine {

    public void select(String name){

    }

    public void pay(int amount){}

    public void reset(){}

}
