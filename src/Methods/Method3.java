package Methods;
// Напишете метод, който връща английското
// наименование на последната цифра от дадено число.
// Примери: за числото 512 отпечатва "two"; за числото 1024 – "four".
public class Method3 {

    public static String getLastDigitName(int number) {
        // Намиране на последната цифра
        int lastDigit = Math.abs(number % 10);

        // Връщане на английското наименование на последната цифра
        switch (lastDigit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return ""; // Това никога няма да се случи, но е добра практика да има default case
        }
    }

    // Главен метод за тестване на getLastDigitName
    public static void main(String[] args) {
        // Примерни числа за тестване
        int[] testNumbers = {512, 1024, 789, 0, -123, -456};

        // Тестване и отпечатване на резултатите
        for (int number : testNumbers) {
            System.out.println("The last digit of " + number + " is " + getLastDigitName(number));
        }
    }
}
