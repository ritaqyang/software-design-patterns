package ca.mcgill.cs.swdesign.composite.concert3;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
     * copy constructor for DoubleBill
     * makes a deep copy of the underlying movies
     *
     */
    public DoubleBill(DoubleBill d){
        movie1 = new Movie(d.movie1);
        movie2 = new Movie(d.movie2);
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
     * @return a copy of DoubleBill using the copy constructor
     */
    @Override
    public Show copy() {
        return new DoubleBill(this);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleBill shows = (DoubleBill) o;
        return Objects.equals(movie1, shows.movie1) && Objects.equals(movie2, shows.movie2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie1, movie2);
    }
    /* public Iterator<Show> iterator() {
        return List.of(movie1,movie2).iterator();
    }*/


}