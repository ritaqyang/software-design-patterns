package ca.mcgill.cs.swdesign.inheritance.abstractclass.animal;

import ca.mcgill.cs.swdesign.inheritance.abstractclass.animal.AbstractAnimal;
import lombok.Data;

@Data
public class Dog extends AbstractAnimal {
    @Override
    public void bark() {
        System.out.println("dog woof woof ");
    }
}
