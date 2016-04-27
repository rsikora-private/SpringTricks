import java.util.Arrays;

/**
 * Created by robertsikora on 23.01.2016.
 */
public class MyBean2Impl extends BaseCommand implements MyBean {

    private String [] array;

    public MyBean2Impl(String [] array){
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyBean2Impl{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
