package ca.mcgill.cs.swdesign.unittesting.exercises;

public class NumberLoader2 {

    public static Number loadNumber(String numClass, String numLiteral){
        try{
            String numClassFullName = "java.lang." + numClass;
            Class<?> c = Class.forName(numClassFullName);
            Number value = (Number) c.getDeclaredMethod("valueOf", String.class).invoke(null, numLiteral);
            return value;

        }catch (ReflectiveOperationException | NumberFormatException e ){
            throw new RuntimeException(e);

        }


    }
}
