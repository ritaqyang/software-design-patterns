package ca.mcgill.cs.swdesign.composite.shape;

public interface Shape {

    void move(int x, int y);
    Shape clone();
}
