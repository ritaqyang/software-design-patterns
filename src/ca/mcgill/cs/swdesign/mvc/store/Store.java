package ca.mcgill.cs.swdesign.mvc.store;

public class Store {

    private final NotificationService service = new NotificationService();
    public void newItemPromotion(){
        service.notifyCustomers();
    }
    public NotificationService getService(){
        return service;
    }


}
