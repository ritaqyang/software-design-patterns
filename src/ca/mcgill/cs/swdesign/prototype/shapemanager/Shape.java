package ca.mcgill.cs.swdesign.prototype.shapemanager;

/**
 * Prototype declares an interface for cloning itself
 */
public interface Shape extends Cloneable{
    Shape clone();
}
