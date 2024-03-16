package ca.mcgill.cs.swdesign.inheritance.employee;

import lombok.Data;

@Data
public class Employee extends Person {

    private String title;
    private String employer;
    private char employeeGrade;
    private double salary;

    public Employee(String name, String title) {
        //implicate call super();
        super(name);
        this.title = title;
        System.out.println("Employee constructor ");
    }

    @Override
    public String toString(){
        return super.toString() + "#" + title + "#" + employer;
    }

    public static void main(String[] args){

        Employee Tom = new Employee("Tom", "Lead Developer");
        Tom.setEmail("tomslay@gmail.com");
        Tom.setPhoneNumber("5147888899");
        Tom.setEmployer("Apple");

        System.out.println(Tom);


    }
}
