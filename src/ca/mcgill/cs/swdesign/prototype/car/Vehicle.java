package ca.mcgill.cs.swdesign.prototype.car;

public abstract class Vehicle {

    private String brand;
    private String model;
    private String color;

    protected Vehicle(){};
    protected Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.color = vehicle.color;
        this.model = vehicle.model;
    }

    public abstract Vehicle clone();
}
