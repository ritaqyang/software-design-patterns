package ca.mcgill.cs.swdesign.inheritance.abstractclass.animal;

public class Animal {
    public void bark(){
        System.out.println("test bark");
    };
    public static void main(String[] args){
        Animal a = new Animal();
        a.bark();
    }
}
