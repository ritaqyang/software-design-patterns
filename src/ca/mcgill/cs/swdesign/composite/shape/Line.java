package ca.mcgill.cs.swdesign.composite.shape;

import lombok.Data;

@Data
public class Line implements Shape {

    private int x_start;
    private int y_start;
    private int x_end;
    private int y_end;
    private Color currentColor = new Color(0.5f, 0.5f,0.5f);

    @Override
    public void move(int x, int y) {
        x_start = x_start + x;
        y_start = y_start + y;
        x_end = x_end + x;
        y_end = y_end + y;
    }

    @Override
    public Line clone() {
        try {
            Line clone = (Line) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            assert false;
            return null;
        }
    }

}
