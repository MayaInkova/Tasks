package inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public void updateQuantity(String productName, int quantity) {
        Product product = products.get(productName);
        if (product != null) {
            product.setQuantity(quantity);
        } else {
            System.out.println("Продуктът с име " + productName + " не е намерен.");
        }
    }

    public Product searchByName(String name) {
        return products.get(name);
    }

    public List<Product> searchByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Product product : products.values()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        return totalValue;
    }

    public void printAllProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}


