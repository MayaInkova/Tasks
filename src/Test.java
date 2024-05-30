public class Test {

    public static void main(String[] args) {
        // Създаване на обект от класа Car
        Car car = new Car();

        // Извеждане на информация за колата
        System.out.println("Car details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Power: " + car.getPower() + " hp");
    }
}

