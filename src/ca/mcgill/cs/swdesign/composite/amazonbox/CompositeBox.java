package ca.mcgill.cs.swdesign.composite.amazonbox;
import java.util.*;
public class CompositeBox implements Box {

    private final List<Box> children = new ArrayList<>();
    public CompositeBox(Box...boxes){
        children.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice(){
        return children.stream().mapToDouble(Box::calculatePrice).sum();
    }

}
