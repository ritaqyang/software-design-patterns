package ca.mcgill.cs.swdesign.prototype.car;

/**
 * https://www.youtube.com/watch?v=DcFhITC9v0E
 *
 * prototyle design pattern
 * Delegates the object duplication or cloning to the actual objects
 * that are being cloned
 */
public class Car extends Vehicle{
    private int speed;
    private GpsSystem gps;
    public Car(){
        super();
    };

    public Car(Car car){
        super(car);
        this.speed = car.speed;
        this.gps = new GpsSystem(); //deep copy
    };
    public Car(String brand, String model, String color, int speed, GpsSystem gps) {
        super(brand, model, color);
        this.speed = speed;
        this.gps = gps;
    }


    /**
     * @return
     */
    @Override
    public Car clone() {
        return new Car(this);
    }
}
