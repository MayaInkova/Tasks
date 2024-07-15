package regularЕxpressions;

public class CatalogApplication {
    public static void main(String[] args) {

        // Създаваме низ с продуктите и цените им
        String catalog =
                "MicrowaveOven: 170, \n" +
                        "AudioSystem: 125, \n" +
                        "TV: 315, \n" +
                        "Refrigerator: 400";

        // Отпечатваме оригиналния низ
        System.out.println(catalog);

        /* MicrowaveOven: 170,
            AudioSystem: 125,
            TV: 315,
            Refrigerator: 400 */

        // Разделяме низа на части, като използваме регулярния израз за разделяне по цифри, интервали и запетаи
        String[] products = catalog.split("[\\d\\s,:]+");

        // Отпечатваме всеки продукт
        for(String product : products) {
            System.out.print(product + " ");
        }

        // Резултат: MicrowaveOven AudioSystem TV Refrigerator
        System.out.println();

        // Разделяме низа на части, като използваме регулярния израз за разделяне по нецифрови символи
        String[] prices = catalog.split("\\D+");

        // Отпечатваме всяка цена
        for(String price : prices) {
            System.out.print(price + " ");
        }

        // Резултат: 170 125 315 400
    }
}
