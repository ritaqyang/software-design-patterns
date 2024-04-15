package ca.mcgill.cs.swdesign.observer.weathertracker;

public class HumidityObserver implements WeatherObserver{

    private int humidity = 0;

    public int getHumidity() {
        return humidity;
    }

    @Override
    public void update(WeatherTrackerView pView) {
        humidity = pView.getHumidity();
    }

}
