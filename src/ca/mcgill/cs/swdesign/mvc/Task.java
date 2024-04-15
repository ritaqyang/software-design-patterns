package ca.mcgill.cs.swdesign.mvc;

public class Task {
    private final String aName;

    public Task(String pName) {
        aName = pName;
    }

    public String getName() {
        return  aName;
    }
}
