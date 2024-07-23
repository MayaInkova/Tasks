package algorithms;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Supermarket {
    // Вътрешен клас за представяне на стоката
    static class Product {
        String barcode;
        String manufacturer;
        String name;
        double price;

        Product(String barcode, String manufacturer, String name, double price) {
            this.barcode = barcode;
            this.manufacturer = manufacturer;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "barcode='" + barcode + '\'' +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    // TreeMap, който пази продуктите сортирани по цена
    private TreeMap<Double, Product> productsByPrice = new TreeMap<>();

    // Метод за добавяне на продукт
    public void addProduct(String barcode, String manufacturer, String name, double price) {
        Product product = new Product(barcode, manufacturer, name, price);
        productsByPrice.put(price, product);
    }

    // Метод за намиране на всички продукти в даден ценови диапазон
    public void findProductsInPriceRange(double low, double high) {
        // Извличаме под-частта от TreeMap в диапазона [low, high]
        NavigableMap<Double, Product> subMap = productsByPrice.subMap(low, true, high, true);
        for (Map.Entry<Double, Product> entry : subMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        // Добавяне на продукти
        supermarket.addProduct("001", "Producer1", "Product1", 4.99);
        supermarket.addProduct("002", "Producer2", "Product2", 5.49);
        supermarket.addProduct("003", "Producer3", "Product3", 7.99);
        supermarket.addProduct("004", "Producer4", "Product4", 10.49);
        supermarket.addProduct("005", "Producer5", "Product5", 9.99);

        // Търсене на продукти в диапазона 5 - 10 лева
        System.out.println("Products between 5 and 10:");
        supermarket.findProductsInPriceRange(5.0, 10.0);
    }
}

