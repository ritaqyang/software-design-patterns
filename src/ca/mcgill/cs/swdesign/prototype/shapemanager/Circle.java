package ca.mcgill.cs.swdesign.prototype.shapemanager;

/**
 * circle is a concrete prototype
 */
public class Circle implements Shape {

    private int diameter;

    /**
     * @return
     */
    @Override
    public Circle clone() {
        try {
            Circle clone = (Circle) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            assert false;
            return null;

        }
    }

}
