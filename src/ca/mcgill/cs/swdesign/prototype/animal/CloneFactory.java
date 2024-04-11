package ca.mcgill.cs.swdesign.prototype.animal;

/**
 * factory does not know hwat these objects are
 * only know they are animal
 */
public class CloneFactory {
    public Animal getClone(Animal animalSample){
        return animalSample.makeCopy();
    }
}
