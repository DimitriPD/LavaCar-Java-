public class Service {
    private String description;
    private double price;

    public Service(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String serviceInfo() {
        return "Service{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
