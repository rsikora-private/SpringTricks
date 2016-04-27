import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by robertsikora on 24.01.2016.
 */
public class ExampleValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    public void validate(Object target, Errors errors) {

        errors.rejectValue("dsd", "dsfsdf");
    }
}
