import java.util.List;

public class MyDeli {
    public static void main(String[] args){
        //1. Create 2 drivers (d1 and d2) and 2 clients (c1 and c2)
        Driver d1 = new Driver();
        Driver d2 = new Driver();
        Client c1 = new Client();
        Client c2 = new Client();
        
        //2.Client c1 books one 2km food delivery, one 5km express delivery.
        Service foodService = new Service("food delivery", 1.0, 2);
        Service expressServiceOfClient1 = new Service("express delivery", 2.0, 5);
        c1.bookService(foodService);
        c1.bookService(expressServiceOfClient1);

        //3.Client c2 books one 10km express delivery
        Service expressServiceOfClient2 = new Service("express delivery", 2.0, 10);
        c2.bookService(expressServiceOfClient2);

        //4.Driver d1 accepts the food delivery
        d1.acceptedService(foodService);

        //5.Show the status of all services of client c1
        List<Service> bookedServicesOfClient1 = c1.getBookedServices();
        for(Service service : bookedServicesOfClient1){
            c1.checkStatus(service);
        }

        //6.Driver d2 accepts the 5km express delivery, after finishing the service, accepts the 10km express delivery
        d2.acceptedService(expressServiceOfClient1);
        d2.deliveredServices(expressServiceOfClient1);
        d2.acceptedService(expressServiceOfClient2);

        //7.Show the balance (account) of two drivers
        System.out.println("Balance of d1: " + d1.getBalance());
        System.out.println("Balance of d2: " + d2.getBalance());

        //8.Driver d1 finish all services, driver d2 finish all services
        for(Service service : d1.getTakenServices()){
            if(service.getStatus() != ServiceStatus.DELIVERED){
                d1.deliveredServices(service);
            }
        }

        for(Service service : d2.getTakenServices()){
            if(service.getStatus() != ServiceStatus.DELIVERED){
                d2.deliveredServices(service);
            }
        }

        //9.Show the status of all services of client c2
        List<Service> bookedServicesOfClient2 = c2.getBookedServices();
        for(Service service : bookedServicesOfClient2){
            c2.checkStatus(service);
        }

        //c1.Client c1 books one 7km in-day delivery
        Service indayServiceOfClient1 = new Service("inday delivery", 0.5, 7);

        //c2.Client c2 books one 5km in-day delivery
        Service indayServiceOfClient2 = new Service("inday delivery", 0.5, 5);

        //c3.Combine 2 booking into a single service and give it to the driver d1.
        Service indayService = new Service("inday delivery", 0.5, indayServiceOfClient1.getDistance() + indayServiceOfClient2.getDistance());
        d1.acceptedService(indayService);

        //c4.Show the balance of driver d1
        System.out.println("Balance of d1: " + d1.getBalance());
    }
}
