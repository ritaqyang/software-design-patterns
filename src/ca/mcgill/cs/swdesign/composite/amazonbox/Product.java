package ca.mcgill.cs.swdesign.composite.amazonbox;


import lombok.Data;

@Data
public abstract class Product implements Box {
    protected final String title;
    protected final double price;
}
