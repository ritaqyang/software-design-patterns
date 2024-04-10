package ca.mcgill.cs.swdesign.visitor.insurance;

/**
 * now we can add more visiting behaviors without modifying existing code
 * following the open-close principle
 */
public class SomeOtherVisitor implements Visitor{
    /**
     * @param bankToVisit
     */
    @Override
    public void visitBank(Bank bankToVisit) {

    }

    /**
     * @param companyToVisit
     */
    @Override
    public void visitCompany(Company companyToVisit) {

    }
}
