package ca.mcgill.cs.swdesign.mvc;

public class Department {
    private final String aName;
    public Department(String pName) {
        aName = pName;
    }

    public String getName() {
        return  aName;
    }

}
