package ca.mcgill.cs.swdesign.inheritance.abstractclass.recipe;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady(){
        System.out.println("get the raw materials");

    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
        System.out.println("use microwave ");


    }

    @Override
    void cleanup() {
        System.out.println("cleaning up ");
        System.out.println("turn off the microwave");

    }
}
