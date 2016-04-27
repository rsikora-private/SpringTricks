/**
 * Created by robertsikora on 24.01.2016.
 */
public class Prototype {

    private MyBean1Impl myBean1;

    public void f(){
        System.out.println("Method from prototype !!!");
    }


    public MyBean1Impl getMyBean1() {
        return myBean1;
    }

    public void setMyBean1(MyBean1Impl myBean1) {
        this.myBean1 = myBean1;
    }
}
