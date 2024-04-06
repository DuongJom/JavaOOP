public class Service{
    private String name;
    private double price;
    private ServiceStatus status;
    private double distance;

    public Service(String name, double price, double distance){
        this.name = name;
        this.price = price;
        this.distance = distance;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public ServiceStatus getStatus(){
        return this.status;
    }

    public void setStatus(ServiceStatus status){
        this.status = status;
    }

    public double getDistance(){
        return this.distance;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }
}