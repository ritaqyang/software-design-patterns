package ca.mcgill.cs.swdesign.observer.simplepushpull;

public class ConcretePullObserver implements ObserverPull {
    private SubjectPullMethod subject;
    public ConcretePullObserver(SubjectPullMethod s){
        this.subject = s;
    }
    @Override
    public void update() {
        String data = subject.getData();
        System.out.println("pull-method observer got data: " + data);
    }
}
