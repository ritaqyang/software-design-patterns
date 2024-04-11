package ca.mcgill.cs.swdesign.prototype.animal;

public class Sheep implements  Animal  {
    public Sheep(){
        System.out.println("Sheep is made");
    }
    public Animal makeCopy() {
        Sheep sheepObj = null;
        try{
            sheepObj = (Sheep) super.clone();
            } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheepObj;
    }

    public String toString(){
        return "Dolly is my hero";
    }
}
