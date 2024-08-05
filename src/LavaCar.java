import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LavaCar {
    private List<Service> services;
    private List<Invoice> invoices;

    public LavaCar() {
        this.services = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void listServices() {
        for (Service service : services) {
            System.out.println(service.serviceInfo());
        }
    }

    public void createInvoice(Customer customer, Car car, Service service) {
        Invoice invoice = new Invoice(customer, car, service, new Date());
        invoices.add(invoice);
        System.out.println("Invoice created: " + invoice);
    }

    public void listInvoices() {
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

    public static void main(String[] args) {
        LavaCar lavaCar = new LavaCar();

        Service basicWash = new Service("Basic Wash", 20.0);
        Service deluxeWash = new Service("Deluxe Wash", 35.0);
        Service interiorCleaning = new Service("Interior Cleaning", 15.0);

        lavaCar.addService(basicWash);
        lavaCar.addService(deluxeWash);
        lavaCar.addService(interiorCleaning);

        System.out.println("Available Services:");
        lavaCar.listServices();

        Customer customer = new Customer("John Doe", "123-456-7890");
        Car car = new Car("ABC-1234", "Toyota Corolla", "Blue");

        lavaCar.createInvoice(customer, car, deluxeWash);

        System.out.println("\nInvoices:");
        lavaCar.listInvoices();
    }
}
