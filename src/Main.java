import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by robertsikora on 02.02.2016.
 */
public class Main {

    public static void main(String... args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        MyBean myBean1 = (MyBean) context.getBean("command", 1, "nazwa");
        System.out.println(myBean1);

        MyBean myBean12 = (MyBean) context.getBean("command", 1, "nazwa12");
        System.out.println(myBean12);

        String[] array = {"A", "B"};

        MyBean myBean2 = (MyBean) context.getBean("command", 2, array);
        System.out.println(myBean2);
    }
}

