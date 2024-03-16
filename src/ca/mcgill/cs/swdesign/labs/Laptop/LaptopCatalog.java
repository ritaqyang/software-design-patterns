package ca.mcgill.cs.swdesign.labs.Laptop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

/**
 * LaptopCatalog class contains a list of Laptop objects called aLaptops
 * We will design a mechanism that compare two different catalog objects
 *
 */
public class LaptopCatalog {
    private List<Laptop> aLaptops;

    public LaptopCatalog() {
        aLaptops = new ArrayList<>();
    }

    public void addLaptop(Laptop pLaptop) {
        assert pLaptop != null;
        aLaptops.add(pLaptop);
    }
    public int getSize() {
        return aLaptops.size();
    }



    /**
     * @todo provide a method that returns an object which allows the client to iterate through aLaptops.
     * Make sure not to leak any information about the internal structure of LaptopCatalog.
     * @return an iterator for iterating through the laptops in the catalog
     */
    public Iterator<Laptop> iterator(){
        return Collections.unmodifiableList(aLaptops).iterator();
    }

    /**
     * Sorts a list of LaptopCatalog objects based on their sizes.
     * A LaptopCatalog with a smaller size comes before a LaptopCatalog with a larger size.
     *
     * @param catalogs the list of LaptopCatalog objects to be sorted
     */
    public static void sortBySize(List<LaptopCatalog> catalogs) {
        Comparator<LaptopCatalog> sizeComparator = Comparator.comparingInt(LaptopCatalog::getSize);
        catalogs.sort(sizeComparator);
    }

    public static void sortBySize2(List<LaptopCatalog> catalogs) {
        catalogs.sort(Comparator.comparingInt(LaptopCatalog::getSize));
    }

    public static void sortBySize3(List<LaptopCatalog> catalogs) {
        catalogs.sort((catalog1, catalog2) -> Integer.compare(catalog1.getSize(), catalog2.getSize()));

    }


    public class SizeComparator implements Comparator<LaptopCatalog> {
        @Override
        public int compare(LaptopCatalog catalog1, LaptopCatalog catalog2) {
            return Integer.compare(catalog1.getSize(), catalog2.getSize());
        }
    }

    public class ByOperatingSystemComparator implements Comparator<LaptopCatalog> {

        private Laptop.OperatingSystem targetOperatingSystem;

        public ByOperatingSystemComparator(Laptop.OperatingSystem operatingSystem) {
            targetOperatingSystem = operatingSystem;
        }

        @Override
        public int compare(LaptopCatalog catalog1, LaptopCatalog catalog2) {
            long count1 = catalog1.aLaptops.stream()
                    .filter(laptop -> laptop.getOperatingSystem() == targetOperatingSystem)
                    .count();
            long count2 = catalog2.aLaptops.stream()
                    .filter(laptop -> laptop.getOperatingSystem() == targetOperatingSystem)
                    .count();
            return Long.compare(count1, count2);
        }
    }


}
