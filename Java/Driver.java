import java.util.ArrayList;
import java.util.List;

public class Driver {
    private List<Service> takenServices;
    private double balance;

    public Driver() {
        this.takenServices = new ArrayList<Service>();
        this.balance = 0.0;
    }

    public void acceptedService(Service service) {
        service.setStatus(ServiceStatus.DELIVERING);
        this.takenServices.add(service);
    }

    public void deliveredServices(Service service) {
        service.setStatus(ServiceStatus.DELIVERED);
        this.balance = service.getPrice()*service.getDistance()*0.8;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Service> getTakenServices() {
        return this.takenServices;
    }
}
