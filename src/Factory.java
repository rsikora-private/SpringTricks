/**
 * Created by robertsikora on 23.01.2016.
 */
public class Factory {

    public MyBean createInstance(int type, Object arg){

        if(type == 1) {
            return new MyBean1Impl((String)arg, 0);
        }
        return new MyBean2Impl((String[])arg);
    }
}
