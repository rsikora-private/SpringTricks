import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by robertsikora on 14.04.2016.
 */
public class DynamicProxy implements InvocationHandler {

    private final Object target;

    public DynamicProxy(final Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");

        return method.invoke(target, args);
    }
}
