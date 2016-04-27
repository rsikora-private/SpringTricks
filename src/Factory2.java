import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * Created by robertsikora on 23.01.2016.
 */
public class Factory2 extends AbstractFactoryBean<MyBean> {
    @Override
    public Class<?> getObjectType() {
        return MyBean1Impl.class;
    }

    @Override
    protected MyBean createInstance() throws Exception {
        return new MyBean1Impl();
    }
}
