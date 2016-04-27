/**
 * Created by robertsikora on 24.01.2016.
 */
public abstract class Singleton {

    protected abstract Prototype createPrototype();

    public void doIt(){
        Prototype prototype = createPrototype();
        System.out.println(prototype);
        System.out.println(prototype.getMyBean1());

        prototype.f();
    }
}
