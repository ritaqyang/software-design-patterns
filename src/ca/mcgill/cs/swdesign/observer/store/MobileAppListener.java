package ca.mcgill.cs.swdesign.observer.store;

public class MobileAppListener implements Listener{
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    public void update(Event e ){
        System.out.println("sends notification through mobile app to " + username + " about " + e);

    }

}
