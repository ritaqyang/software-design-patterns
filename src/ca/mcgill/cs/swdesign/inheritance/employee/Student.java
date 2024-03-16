package ca.mcgill.cs.swdesign.inheritance.employee;
//ISA relationship
public class Student extends Person{

    private String College;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }
}
