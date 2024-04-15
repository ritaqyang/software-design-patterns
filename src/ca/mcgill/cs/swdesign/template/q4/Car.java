package ca.mcgill.cs.swdesign.template.q4;

public class Car extends Vehicle  {
    private int aSeats;

    public Car(String pLicensePlate, String pModelName, int pSeats){
        super(pLicensePlate, pModelName);
        assert  pSeats > 0;
        aSeats = pSeats;
    }

    public String getSpecificDetails(){
        return "Seats: " + aSeats;
    }
}
