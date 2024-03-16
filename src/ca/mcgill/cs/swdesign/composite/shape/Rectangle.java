package ca.mcgill.cs.swdesign.composite.shape;

public class Rectangle implements Shape{
    private int x_center;
    private int y_center;
    private int width;
    private int height;
    private Color currentColor = new Color(0.5f, 0.5f,0.5f);

    @Override
    public void move(int x, int y) {
        x_center = x_center + x;
        y_center = y_center + y;
    }

    @Override
    public Rectangle clone() {
        try {
            Rectangle clone = (Rectangle) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            assert false;
            return null;
        }
    }
}
