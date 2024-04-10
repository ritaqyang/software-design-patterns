package ca.mcgill.cs.swdesign.visitor.insurance;

public interface Visitor {

    void visitBank(Bank bankToVisit );
    void visitCompany(Company companyToVisit);
}
