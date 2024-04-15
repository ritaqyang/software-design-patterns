package ca.mcgill.cs.swdesign.mvc;

public class Manager extends Employee {
    public Manager(String pName, Department pDepartment) {
        super(pName, pDepartment);
    }

    void annualReview(){
        System.out.println("Reviewing...");
    }

    @Override
    public String getName() {
        return "Manager: " + super.getName() + "," + super.getDepartment().getName();
    }

}
