package ca.mcgill.cs.swdesign.template.q4;

public class Truck {
    private String aLicensePlate;
    private String aModelName;
    private String aCompany;

    public Truck(String pLicensePlate, String pModelName, String pCompany){
        assert pLicensePlate != null && pModelName != null && pCompany != null;
        aLicensePlate = pLicensePlate;
        aModelName = pModelName;
        aCompany = pCompany;
    }

    public String getLicensePlate() {
        return aLicensePlate;
    }

    public String getModelName(){
        return aModelName;
    }

    public String getCompany(){
        return aCompany;
    }

    public String getDetails(){
        return "License: " + aLicensePlate + "Model: " + aModelName + "Company: " + aCompany;
    }
}