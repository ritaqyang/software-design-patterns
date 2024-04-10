package ca.mcgill.cs.swdesign.visitor.insurance;

public class MessageVisitor implements Visitor{
    /**
     * @param bankToVisit
     */
    @Override
    public void visitBank(Bank bankToVisit) {
        System.out.println("sends fraud insurance email for bank ");
    }

    /**
     * @param companyToVisit
     */
    @Override
    public void visitCompany(Company companyToVisit) {
        System.out.println("sends risk insurance email for company");

    }
}
