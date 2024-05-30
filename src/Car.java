import java.util.Arrays;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int power;
    private String engineType;
    private String transmissionType;
    private int year;

    // Конструктор без параметри
    public Car() {
    }

    // Конструктор с параметри
    public Car(String brand, String model, String color, int power, String engineType, String transmissionType, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
        this.year = year;
    }

    // Гетъри и сетъри
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод за филтриране на колите по марка
    public static Car[] filterByBrand(Car[] cars, char letter) {
        Car[] filteredCars = new Car[cars.length];
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().charAt(0) == Character.toUpperCase(letter)) {
                filteredCars[count++] = car;
            }
        }
        return Arrays.copyOf(filteredCars, count);
    }

    // Метод за сортиране на колите по марка
    public static Car[] sortByBrand(Car[] cars, boolean ascending) {
        Arrays.sort(cars, (car1, car2) -> {
            if (ascending) {
                return car1.getBrand().compareTo(car2.getBrand());
            } else {
                return car2.getBrand().compareTo(car1.getBrand());
            }
        });
        return cars;
    }

    // Метод за премахване на повтарящи се коли
    public static Car[] removeDuplicates(Car[] cars) {
        Car[] uniqueCars = new Car[cars.length];
        int count = 0;
        for (Car car : cars) {
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (car.equals(uniqueCars[i])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCars[count++] = car;
            }
        }
        return Arrays.copyOf(uniqueCars, count);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", engineType='" + engineType + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) &&
                power == car.power && engineType.equals(car.engineType) && transmissionType.equals(car.transmissionType) &&
                year == car.year;
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + power;
        result = 31 * result + engineType.hashCode();
        result = 31 * result + transmissionType.hashCode();
        result = 31 * result + year;
        return result;
    }
}


