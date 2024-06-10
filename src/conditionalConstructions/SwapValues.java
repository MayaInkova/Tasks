package conditionalConstructions;
//   if-конструкция,
//  която изчислява стойността на две целочислени променливи и разменя техните стойности,
//  ако стойността на първата променлива е по-голяма от втората.
public class SwapValues {
    public static void main(String[] args) {
        int a = 10; // Примерни стойности
        int b = 5;

        System.out.println("Преди размяната: a = " + a + ", b = " + b);

        // Проверка дали стойността на 'a' е по-голяма от тази на 'b'
        if (a > b) {
            // Размяна на стойностите
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("След размяната: a = " + a + ", b = " + b);
    }
}
