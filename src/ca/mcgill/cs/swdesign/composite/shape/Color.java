package ca.mcgill.cs.swdesign.composite.shape;
import lombok.Data;

/**
 * Representing the color using the RGB model, i.e. red, green, and blue.
 */

@Data
public class Color {
    private final float red;
    private final float green;
    private final float blue;

    /**
     * Creates a new instance of color.
     *
     * @param red red component ranging from 0 to 1
     * @param green green component ranging from 0 to 1
     * @param blue blue component ranging from 0 to 1
     */
    public Color(float red, float green, float blue) {
        assert red>=0 && red<=1 && green>=0 && green<=1 && blue>=0 && blue<=1;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    @Override
    public String toString() {
        return "Color{" +
                "R: " + red +
                ", G: " + green +
                ", B: " + blue +
                '}';
    }
}
