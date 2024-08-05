import java.util.Date;

public class Invoice {
    private Customer customer;
    private Car car;
    private Service service;
    private Date date;

    public Invoice(Customer customer, Car car, Service service, Date date) {
        this.customer = customer;
        this.car = car;
        this.service = service;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public Service getService() {
        return service;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer=" + customer.getName() +
                ", car=" + car.getLicensePlate() +
                ", service=" + service.getDescription() +
                ", date=" + date +
                '}';
    }
}
