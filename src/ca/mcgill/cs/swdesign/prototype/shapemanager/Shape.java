package ca.mcgill.cs.swdesign.prototype.shapemanager;

/**
 * Prototype declares an interface for cloning itself
 * Benefits:
 * 1) Concrete objects are hidden from client
 * 2) flexibility in adding or removing classes without changing client code
 * 3) client can build complex objects by updating fields of prototype
 *
 * Con:
 * you need to correctly override clone methods for all subclasses
 */
public interface Shape extends Cloneable{
    Shape clone();
}
