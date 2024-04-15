package ca.mcgill.cs.swdesign.template.concert;

import java.util.Iterator;

public abstract class AbstractShow implements Show{
    private String aTitle;
    private int aDuration;

    public AbstractShow(String pTitle, int pDuration) {
       aTitle = pTitle;
       aDuration = pDuration;
    }

    @Override
    public String description() {
        return String.format("s%: s% (%d minutes)", getaTitle(), extra(),runningTime() );
    }

    protected abstract String extra();

    /**
     * @return
     */
    @Override
    public int runningTime() {
        return aDuration;
    }

    public String getaTitle() {
        return aTitle;
    }

    /**
     * @return
     */
    @Override
    public Show copy() {
        return null;
    }


    /**
     * @return
     */
    @Override
    public Iterator<Show> iterator() {
        return null;
    }
}
