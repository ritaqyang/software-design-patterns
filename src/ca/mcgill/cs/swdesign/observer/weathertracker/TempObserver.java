package ca.mcgill.cs.swdesign.observer.weathertracker;

public class TempObserver implements WeatherObserver{
    public int getTemp() {
        return temp;
    }

    private int temp = 0;

    /**
     * @param pView
     */
    @Override
    public void update(WeatherTrackerView pView) {
        temp = pView.getTemperature();
    }
}
