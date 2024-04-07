package ca.mcgill.cs.swdesign.observer.store;

public class Client {

    public static void main(String[] args){
        Store aritzia = new Store();
        //add a new subscriber who wants to know about new item
        aritzia.getService().subscribe(Event.NEW_ITEM, new EmailMsgListener("rita@gmail.com"));

        //add a mobile subscriber who wants to know about new item
        aritzia.getService().subscribe(Event.SALE, new MobileAppListener("rita233"));

        aritzia.newItemPromotion();
        aritzia.salePromotion();
    }
}
