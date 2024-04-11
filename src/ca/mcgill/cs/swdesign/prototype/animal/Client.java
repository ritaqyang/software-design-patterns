package ca.mcgill.cs.swdesign.prototype.animal;

public class Client {

    public static void main(String[] args) {
        CloneFactory factory = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep)  factory.getClone(sally);
        System.out.println("Sally hashcode:" + sally.hashCode());
        System.out.println("Sally clone hashcode:" + clonedSheep.hashCode());

    }
}
