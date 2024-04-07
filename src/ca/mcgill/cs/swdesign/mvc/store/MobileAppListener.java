package ca.mcgill.cs.swdesign.mvc.store;

public class MobileAppListener implements Listener{
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    public void update(){
        System.out.println("sends notification through mobile app");

    }

}
