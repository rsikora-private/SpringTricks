import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by robertsikora on 23.01.2016.
 */
public class ThirdPartyLibReplacement implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        System.out.println("RELPLACEMENT !!!");

        return null;
    }
}
