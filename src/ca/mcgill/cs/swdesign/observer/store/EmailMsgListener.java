package ca.mcgill.cs.swdesign.observer.store;

public class EmailMsgListener implements Listener{

    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }
    public void update(Event e){
        //send the email
        System.out.println("sending email to" + email + "to update about " + e);
    }
}
