package ca.mcgill.cs.swdesign.mvc.store;

public class Client {

    public static void main(String[] args){
        Store aritzia = new Store();
        //add a new subscriber
        aritzia.getService().subscribe(new EmailMsgListener("rita@gmail.com"));

        //add a mobile subscriber
        aritzia.getService().subscribe(new MobileAppListener("rita233"));

        aritzia.newItemPromotion();
    }
}
