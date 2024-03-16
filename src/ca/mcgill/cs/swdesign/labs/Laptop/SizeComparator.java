package ca.mcgill.cs.swdesign.labs.Laptop;

import java.util.Comparator;

/**
 * SizeComparator sizeComparator = new SizeComparator();
 * catalogs.sort(sizeComparator);
 */
public class SizeComparator implements Comparator<LaptopCatalog> {
    @Override
    public int compare(LaptopCatalog catalog1, LaptopCatalog catalog2) {
        return Integer.compare(catalog1.getSize(), catalog2.getSize());
    }
}

