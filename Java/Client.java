import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Service> bookedServices;

    public Client(){
        bookedServices = new ArrayList<Service>();
    }

    public void bookService(Service service){
        service.setStatus(ServiceStatus.BOOKED);
        this.bookedServices.add(service);
    }

    public void checkStatus(Service service){
        switch (service.getStatus()) {
            case BOOKED:
                System.out.println("Service is booked.");
                break;
            case DELIVERING:
                System.out.println("Service is delivering.");
                break;
            default: //DELIVERED
                System.out.println("Service is delivered.");
                break;
        }
        //if...else if...else
    }

    public List<Service> getBookedServices(){
        return this.bookedServices;
    }
}
