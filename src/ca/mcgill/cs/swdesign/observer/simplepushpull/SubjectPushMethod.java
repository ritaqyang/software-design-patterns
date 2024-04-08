package ca.mcgill.cs.swdesign.observer.simplepushpull;
import java.util.ArrayList;
import java.util.List;

public class SubjectPushMethod {
    private List<Observer>  observers = new ArrayList<>();

    public void addObserver(Observer newObserver){
        observers.add(newObserver);
    }

    public void deleteObserver(Observer observerToDelete){
        observers.remove(observerToDelete);
    }

    public void notifyObservers(String newData){
        for (Observer o : observers){
            o.update(newData);
        }
    }
}
