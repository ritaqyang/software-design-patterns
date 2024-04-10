package ca.mcgill.cs.swdesign.visitor.insurance;

public abstract class InsuranceClient {

    private final String name;
    private final String number;

    public InsuranceClient(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public abstract void accept(Visitor visitor);
}
