package ca.mcgill.cs.swdesign.visitor.insurance;

public class Bank extends InsuranceClient {
    private int numOfBranches;
    public Bank(String name, String number, int numOfBranches) {
        super(name, number);
        this.numOfBranches = numOfBranches;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}

