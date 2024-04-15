package ca.mcgill.cs.swdesign.observer.weathertracker;

public class Client {

    public static void main(String[] args) {
        WeatherTracker tracker = new WeatherTracker();
        HumidityObserver humidityObs = new HumidityObserver();
        tracker.addObservers(humidityObs);
        System.out.println(humidityObs.getHumidity());
        tracker.setMeasurements(20,20,20);
        System.out.println(humidityObs.getHumidity());

    }
}
