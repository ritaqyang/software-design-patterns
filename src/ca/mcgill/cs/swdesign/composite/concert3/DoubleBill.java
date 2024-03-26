package ca.mcgill.cs.swdesign.composite.concert3;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DoubleBill implements Show {

    private Movie movie1;
    private Movie movie2;

    DoubleBill(Movie s1, Movie s2) {
        movie1 = s1;
        movie2 = s2;
    }

    /**
     * @return
     */
    @Override
    public String description() {
        return movie1.description() + movie2.description();
    }

    /**
     * @return
     */
    @Override
    public int runningTime() {
        return movie1.runningTime() + movie2.runningTime();
    }

    /**
     * @return
     */
    @Override
    public Show copy() {
        return new DoubleBill(movie1.copy(), movie2.copy());
    }

    /**
     * @return
     */
    @Override
    public Iterator<Show> iterator() {
        return Show.super.iterator();
    }

    /**
     * @param action The action to be performed for each element
     */
    @Override
    public void forEach(Consumer<? super Show> action) {
        Show.super.forEach(action);
    }

    /**
     * @return
     */
    @Override
    public Spliterator<Show> spliterator() {
        return Show.super.spliterator();
    }


   /* public Iterator<Show> iterator() {
        return List.of(movie1,movie2).iterator();
    }*/


}