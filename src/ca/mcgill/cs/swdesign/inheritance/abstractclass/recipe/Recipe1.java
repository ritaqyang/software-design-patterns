package ca.mcgill.cs.swdesign.inheritance.abstractclass.recipe;

public class Recipe1 extends AbstractRecipe{
    @Override
    void getReady(){
        System.out.println("get the raw materials");

    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanup() {
        System.out.println("cleaning up ");
    }
}
