package Methods;
//  Напишете метод, който намира
//  колко пъти дадено число се среща в даден масив.
//  Напишете програма,
//  която проверява дали този метод работи правилно.
public class Method4 {
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }

    // Главен метод за тестване на countOccurrences
    public static void main(String[] args) {
        // Примерен масив за тестване
        int[] testArray = {1, 2, 3, 4, 2, 5, 2, 6, 2, 7, 8, 2, 9};

        // Примерни числа за тестване
        int testNumber1 = 2;
        int testNumber2 = 5;
        int testNumber3 = 10;

        // Тестване и отпечатване на резултатите
        System.out.println("The number " + testNumber1 + " occurs " + countOccurrences(testArray, testNumber1) + " times in the array.");
        System.out.println("The number " + testNumber2 + " occurs " + countOccurrences(testArray, testNumber2) + " times in the array.");
        System.out.println("The number " + testNumber3 + " occurs " + countOccurrences(testArray, testNumber3) + " times in the array.");
    }


}
