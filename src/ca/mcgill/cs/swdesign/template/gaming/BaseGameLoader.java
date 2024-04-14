package ca.mcgill.cs.swdesign.template.gaming;

public abstract class BaseGameLoader {

    public void load(){
        step1();
        step2();
        step3();
        step4();

    }

    public abstract void step1();
    public abstract void step2();
    public abstract void step3();

    public abstract void step4();


}
