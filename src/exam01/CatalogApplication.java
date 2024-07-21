package exam01;

public class CatalogApplication {

    public static void main(String[] args) {

        String catalog =
                "MicrowaveOven: 170, \n" +
                        "AudioSystem: 125, \n" +
                        "TV: 315, \n" +
                        "Refrigerator: 400";

        // Отпечатване на каталога такъв, какъвто е
        System.out.println(catalog);

        /*
            Изход:
            MicrowaveOven: 170,
            AudioSystem: 125,
            TV: 315,
            Refrigerator: 400
        */

        // Разделяне на низа за извличане на имената на продуктите
        String[] products = catalog.split("[\\d\\s,:]+");
        for(String product : products) {
            if (!product.isEmpty()) {
                System.out.print(product + " ");
            }
        }

        // Резултат: MicrowaveOven AudioSystem TV Refrigerator
        System.out.println();

        // Разделяне на низа за извличане на цените
        String[] prices = catalog.split("\\D+");
        for(String price : prices) {
            if (!price.isEmpty()) {
                System.out.print(price + " ");
            }
        }

        // Резултат: 170 125 315 400
    }
}

