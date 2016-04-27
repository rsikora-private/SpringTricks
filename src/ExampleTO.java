/**
 * Created by robertsikora on 24.01.2016.
 */
public class ExampleTO {

    private  String name;
    private  Integer value;

    public ExampleTO(){}

    public ExampleTO(String name, Integer value) {
        this.setName(name);
        this.setValue(value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Example{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", value=").append(getValue());
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
