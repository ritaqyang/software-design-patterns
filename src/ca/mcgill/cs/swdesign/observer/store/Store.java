package ca.mcgill.cs.swdesign.observer.store;

public class Store {

    private final NotificationService service = new NotificationService();
    public void newItemPromotion(){
        service.notifyCustomers(Event.NEW_ITEM);
    }

    public void salePromotion(){
        service.notifyCustomers(Event.SALE);
    }
    public NotificationService getService(){
        return service;
    }


}
