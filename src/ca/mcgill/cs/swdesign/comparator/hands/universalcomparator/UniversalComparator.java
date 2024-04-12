package ca.mcgill.cs.swdesign.comparator.hands.universalcomparator;

import java.util.Comparator;

/**
 * can choose a compare method (ascending, descending) to compare hands
 * not an example of good design
 */
public class UniversalComparator implements Comparator<Hand> {


    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Hand o1, Hand o2) {
        if (this.method == compareMethod.ASCENDING){
            return o1.getSize() - o2.getSize();
        }
        else {
            return o2.getSize() - o1.getSize();
        }
    }
    public enum compareMethod{
        ASCENDING, DESCENDING
    }

    public void setMethod(compareMethod method) {
        this.method = method;
    }

    private compareMethod method = compareMethod.ASCENDING; //ascending as default





}
