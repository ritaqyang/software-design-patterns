package ca.mcgill.cs.swdesign.liskov.concert;

public class Movie extends AbstractShow{

    private final int year;
    public Movie(String pTitle, int pDuration, int year) {
        super(pTitle, pDuration);
        this.year = year;
    }

    /**
     * this does not violate Liskov
     * because it is actually method overloading
     * since the param is now Movie
     * @param m a movie object
     */

    public void setRecommended(Movie m){
        super.setRecommended(m);
    }

    /**
     * @return
     */
    @Override
    protected String extra() {
        return  "[" + year + "]";
    }
}

