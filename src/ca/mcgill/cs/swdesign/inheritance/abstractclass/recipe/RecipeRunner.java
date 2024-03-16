package ca.mcgill.cs.swdesign.inheritance.abstractclass.recipe;

public class RecipeRunner {

    public static void main(String[] args){
        Recipe1 r1 = new Recipe1();
        r1.execute();

        RecipeWithMicrowave m1 = new RecipeWithMicrowave();
        m1.execute();
    }
}
