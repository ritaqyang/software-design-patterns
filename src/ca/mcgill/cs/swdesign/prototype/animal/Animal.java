package ca.mcgill.cs.swdesign.prototype.animal;
//our prototype
public interface Animal extends Cloneable{
    //instances are stored in diff place in memory

    Animal makeCopy();
}
