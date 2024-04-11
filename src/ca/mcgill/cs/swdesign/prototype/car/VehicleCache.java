package ca.mcgill.cs.swdesign.prototype.car;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {
    private Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache(){
        GpsSystem cacheGps = new GpsSystem();
        Car car = new Car("Bugatti", "Chiron", "Blue", 261, cacheGps);

        cache.put("Bugatti Chiron", car);



    }

    public Vehicle get(String key){
        return cache.get(key).clone();
    }

}
