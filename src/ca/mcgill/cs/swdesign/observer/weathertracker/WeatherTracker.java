package ca.mcgill.cs.swdesign.observer.weathertracker;

import java.util.ArrayList;
import java.util.List;

public class WeatherTracker implements WeatherTrackerView {

    private List<WeatherObserver> observerList = new ArrayList<>();
    public void addObservers(WeatherObserver pWeatherObserver){
        observerList.add(pWeatherObserver);
    }

    public void removeObservers(WeatherObserver pWeatherObserver){
        observerList.remove(pWeatherObserver);
    }

    private int aTemperature;
    private int aHumidity;
    private int aPressure;

    public void setMeasurements(int pTemperature, int pHumidity, int pPressure){
        aTemperature = pTemperature;
        aHumidity = pHumidity;
        aPressure = pPressure;
        //update observers
        for (WeatherObserver o: observerList){
            o.update(this);
        }
    }

    @Override
    public int getTemperature(){
        return aTemperature;
    }
    @Override
    public int getHumidity(){
        return aTemperature;
    }
    @Override
    public int getPressure(){
        return aTemperature;
    }
}