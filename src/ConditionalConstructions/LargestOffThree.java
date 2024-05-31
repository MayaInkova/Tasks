package ConditionalConstructions;
//   Програма, която намира най-голямото по стойност число, измежду три дадени числа.
public class LargestOffThree {
    public static void main(String[] args) {
        int num1 = 10; // Примерни стойности
        int num2 = 15;
        int num3 = 7;

        int largest;

        // Проверка за най-голямото число
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("Най-голямото число е: " + largest);
    }
}
