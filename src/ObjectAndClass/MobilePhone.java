package ObjectAndClass;

public class MobilePhone {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private int battery;
    private String display;

    public MobilePhone(String model, String manufacturer, double price, String owner, int battery, String  display) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.battery = battery;
        this.display = display;
    }

    // Гетъри и сетъри за всички полета

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int  battery) {
        this.battery= battery;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String  display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", battery=" + battery +
                ", display=" + display +
                '}';
    }
}
