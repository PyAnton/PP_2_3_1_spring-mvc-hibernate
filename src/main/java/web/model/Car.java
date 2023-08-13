package web.model;

public class Car {
    private String brend;
    private String model;
    private double price;

    public Car(String brend, String model, double price) {
        this.brend = brend;
        this.model = model;
        this.price = price;
    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
