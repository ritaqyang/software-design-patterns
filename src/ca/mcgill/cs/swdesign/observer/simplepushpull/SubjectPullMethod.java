package ca.mcgill.cs.swdesign.observer.simplepushpull;

import java.util.ArrayList;
import java.util.List;

public class SubjectPullMethod {
    private List<ObserverPull> observers = new ArrayList<>();

    private String data;
    public void addObserver(ObserverPull newObserver){
        observers.add(newObserver);
    }

    public void deleteObserver(ObserverPull observerToDelete){
        observers.remove(observerToDelete);
    }

    public void notifyObservers(){
        for (ObserverPull o : observers){
            o.update();
        }
    }
    public String getData(){
        return data;
    }


}
