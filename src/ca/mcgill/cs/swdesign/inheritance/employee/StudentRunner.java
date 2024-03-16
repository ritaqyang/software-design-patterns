package ca.mcgill.cs.swdesign.inheritance.employee;

public class StudentRunner {

    public static void main(String[] args){
        Student s = new Student();
        s.setName("Rita");
        s.setEmail("ritaqyang@gmail.com");

        Person p = new Person();
        String value = p.toString();
        System.out.println(p);
        System.out.println(value);

    }
}
