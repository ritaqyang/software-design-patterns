package ca.mcgill.cs.swdesign.prototype.shapemanager;

import java.util.ArrayList;
import java.util.List;

/**
 * aggregate a collection of shapes
 * the client can get and add new shapes on demand
 * the client can build complex obj by updating the field of the prototype
 */
public class ShapeManager {
    private final List<Shape> shapeList = new ArrayList<>();
    private Shape prototype;
    public List<Shape> getShapes (){
        List<Shape> shapeListCopy = new ArrayList<>();
        for (Shape s: shapeList){
            shapeListCopy.add(s.clone());
        }
        return shapeListCopy;
    }

    public void setPrototype(Shape s){
        prototype = s.clone();
    }
    public void addShape(){
        shapeList.add(prototype.clone());
    }
}
