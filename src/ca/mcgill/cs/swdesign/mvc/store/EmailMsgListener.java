package ca.mcgill.cs.swdesign.mvc.store;

public class EmailMsgListener implements Listener{

    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }
    public void update(){
        //send the email
        System.out.println("sending email to" + email);
    }
}
