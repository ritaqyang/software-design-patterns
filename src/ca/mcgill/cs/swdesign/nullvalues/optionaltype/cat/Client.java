package ca.mcgill.cs.swdesign.nullvalues.optionaltype.cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Client {
    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();

        Optional<Cat> catFound = shelter.findCatByName("jack");
        if (catFound.isPresent()){
            System.out.println(catFound.get().getAge());
        }else{
            System.out.println(0);
        }
    }
}
