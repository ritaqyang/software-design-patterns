package ca.mcgill.cs.swdesign.comparator.laptop.comparable;

import java.util.Comparator;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private int ram;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    /**
     * this > lap2 = return positive value
     * this < lap2 => return negative value
     * this == lap2 = 0
     * @param laptop2 the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Laptop laptop2) {

        if (this.getRam() > laptop2.getRam()){
            return 1;
        }
        else if (this.getRam() < laptop2.getRam()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "[" + brand + ", " + ram + ", " + price + "]";
    }
}
