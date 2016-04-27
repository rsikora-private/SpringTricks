import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by robertsikora on 24.01.2016.
 */
public final class Example {

    private  String name;
    private  Integer value;

    public Example(Function ss){}

    public Example( String name,  Integer value) {
        this.name = name;
        this.value = value;
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


    public Example show(Example ss){
        System.out.print(ss);

        return this;
    }

    public Integer suma(Integer a, Integer b){
        return a + b;
    }

}
