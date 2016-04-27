import java.util.Arrays;
import java.util.Currency;

/**
 * Created by robertsikora on 23.01.2016.
 */
public class MyBean1Impl extends BaseCommand implements MyBean {

    private String    name;
    private Integer   age;
    private String [] array;
    private Currency  currency;
    private boolean   flag;
    private ThirdPartyLib third;
    private Service service;

    public MyBean1Impl(){}

    public MyBean1Impl(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public ThirdPartyLib getThird() {
        return third;
    }

    public void setThird(ThirdPartyLib third) {
        this.third = third;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyBean1Impl{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", array=").append(Arrays.toString(array));
        sb.append(", currency=").append(currency);
        sb.append(", flag=").append(flag);
        sb.append(", third=").append(third);
        sb.append(", service=").append(service);
        sb.append('}');
        return sb.toString();
    }
}
