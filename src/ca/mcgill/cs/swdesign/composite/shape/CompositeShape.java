package ca.mcgill.cs.swdesign.composite.shape;
import java.util.*;
public class CompositeShape implements Shape{

    private List<Shape> aElements = new ArrayList<>();
    @Override
    public void move(int x, int y){
        for(Shape e: aElements){
            e.move(x,y);
        }
    };

    @Override
    public CompositeShape clone(){
        try{
            CompositeShape clone = (CompositeShape) super.clone();
            clone.aElements = new ArrayList<>();
            for (Shape e : this.aElements){
                clone.aElements.add(e.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e){
            assert false;
            return null;
        }
    }
}
