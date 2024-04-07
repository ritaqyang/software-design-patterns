package ca.mcgill.cs.swdesign.mvc.store;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<Listener> customers = new ArrayList<>();

    public void subscribe(Listener listener){
        customers.add(listener);
    }

    public void unsubscribe(Listener listener){
        customers.remove(listener);
    }

    public void notifyCustomers(){
        customers.forEach(listener -> listener.update());
    }
}
