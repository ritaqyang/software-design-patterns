package ca.mcgill.cs.swdesign.observer.store;



import java.util.*;

public class NotificationService {

    private final Map<Event, List<Listener>> customers = new HashMap<>();

    public NotificationService(){
        Arrays.stream(Event.values()).forEach(event->
                customers.put(event, new ArrayList<>())
        );
    }

    /**
     * adds a subscriber to a store event(sale, new item, etc)
     * @param e
     * @param listener
     */
    public void subscribe(Event e, Listener listener){
       customers.get(e).add(listener);

    }


    public void unsubscribe(Event e, Listener listener){
        customers.get(e).remove(listener);
    }

    public void notifyCustomers(Event e ){
        customers.get(e).forEach(listener -> listener.update(e));
    }
}
