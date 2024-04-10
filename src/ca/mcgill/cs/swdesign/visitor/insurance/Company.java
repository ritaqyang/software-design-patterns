package ca.mcgill.cs.swdesign.visitor.insurance;

public class Company extends InsuranceClient {

    private final int numOfEmployees;
    public Company(String pName, String pNumber, int numOfEmployees) {
        super(pName, pNumber);
        this.numOfEmployees = numOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }
}
