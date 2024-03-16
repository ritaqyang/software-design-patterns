package ca.mcgill.cs.swdesign.inheritance.abstractclass.animal;

public abstract class AbstractAnimal {
    abstract public void bark();
    public static void main(String[] args){
        Dog a = new Dog();
        a.bark();
    }
}
