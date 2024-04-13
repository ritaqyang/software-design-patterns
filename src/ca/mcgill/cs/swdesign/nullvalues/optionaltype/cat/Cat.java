package ca.mcgill.cs.swdesign.nullvalues.optionaltype.cat;

public class Cat {
    private String name;
    private int age;


    public Cat(String name, int i) {
        this.name = name;
        this.age = i;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
