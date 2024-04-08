package ca.mcgill.cs.swdesign.iterator.customarray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomArrayList<T> implements Iterable<T> {

    List<T> myList = new ArrayList<>();
    public void add(T val){
        myList.add(val);
    }
    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(myList);
    }

    public class CustomIterator<E> implements Iterator<E>{
        int indexPosition = 0; //track where we are
        List<E> internalList;

        public CustomIterator(List<E> pInternalList){
            this.internalList = pInternalList;
        }
        @Override
        public boolean hasNext() {
            if (internalList.size() >= indexPosition +1){
                return true;
            }
            return false;
        }
        @Override
        public E next() {
            E val = internalList.get(indexPosition);
            indexPosition += 2 ;
            return val;
        }
    }
}
