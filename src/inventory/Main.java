package inventory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Добавяне на продукти
        inventory.addProduct(new Product("Ябълка", "Плодове", 1.20, 50));
        inventory.addProduct(new Product("Банан", "Плодове", 1.50, 30));
        inventory.addProduct(new Product("Мляко", "Млечни продукти", 2.50, 20));
        inventory.addProduct(new Product("Хляб", "Хлебни изделия", 1.00, 100));

        // Актуализиране на количества
        inventory.updateQuantity("Ябълка", 60);

        // Търсене на продукти по име
        Product apple = inventory.searchByName("Ябълка");
        System.out.println(apple);

        // Търсене на продукти по категория
        List<Product> fruits = inventory.searchByCategory("Плодове");
        System.out.println("Плодове:");
        for (Product product : fruits) {
            System.out.println(product);
        }

        // Изчисляване на обща стойност на инвентара
        double totalValue = inventory.calculateTotalValue();
        System.out.println("Обща стойност на инвентара: " + totalValue);

        // Извеждане на всички продукти
        System.out.println("Всички продукти в инвентара:");
        inventory.printAllProducts();
    }
}
