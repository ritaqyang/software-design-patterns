package ca.mcgill.cs.swdesign.nullvalues.optionaltype.cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatShelter {
    List<Cat> allCats = new ArrayList<>();


    public Optional<Cat> findCatByName(String name){

        for (Cat c : allCats){
            if (c.getName() == name){
                return Optional.ofNullable(c);
            }
        }
        return Optional.empty();
    }
}
