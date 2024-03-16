package ca.mcgill.cs.swdesign.composite.shape;

public class Circle implements Shape {
    private int x_center;
    private int y_center;

    private int radius;
    private Color currentColor = new Color(0.5f, 0.5f,0.5f);

    public Circle(int x_center, int y_center, int r){
        this.x_center = x_center;
        this.y_center = y_center;
        this.radius = r;
    }

    public void move(int x ,int y ){
        x_center = x_center + x;
        y_center = y_center + y;

    }

    public Circle clone(){
        try{
            Circle clone = (Circle) super.clone();
            return clone;
        } catch (CloneNotSupportedException e){
            assert false;
            return null;
        }
    }
}
