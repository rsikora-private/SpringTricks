/**
 * Created by robertsikora on 27.04.2016.
 */
public abstract class BaseCommand {

    private Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
