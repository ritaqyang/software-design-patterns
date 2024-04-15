package ca.mcgill.cs.swdesign.template.q4;

public abstract class Vehicle {

    private String aLicensePlate;
    private String aModelName;

    public Vehicle(String pLicensePlate, String pModelName){
        assert pLicensePlate != null && pModelName != null;
        aLicensePlate = pLicensePlate;
        aModelName = pModelName;

    }

    public String getLicensePlate() {
        return aLicensePlate;
    }

    public String getModelName(){
        return aModelName;
    }

    /**
     * final method so subclasses cannot override
     * @return vehicle details
     */
    public final String getDetails()
    {
        String details = "License: " + aLicensePlate + "Model: " + aModelName;
        details += getSpecificDetails();

        return details;
    }
    protected abstract String getSpecificDetails();
}
