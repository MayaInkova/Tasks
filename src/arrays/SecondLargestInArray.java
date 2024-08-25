package arrays;

public class SecondLargestInArray {


    //програма, която приема масив от цели числа и намира второто по големина число в масива.
    public static void main(String[] args) {
        // Примерен масив от цели числа
        int[] numbers = {12, 35, 1, 10, 34, 1};

        // Извикване на метода за намиране на второто по големина число
        int secondLargest = findSecondLargest(numbers);

        // Проверка и извеждане на резултата
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Второто по големина число е: " + secondLargest);
        } else {
            System.out.println("Не съществува второ по големина число.");
        }
    }

    // Метод за намиране на второто по големина число
    public static int findSecondLargest(int[] array) {
        // Проверка дали масивът съдържа поне два елемента
        if (array.length < 2) {
            System.out.println("Масивът трябва да съдържа поне два елемента.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Обхождане на масива и намиране на най-голямото и второто по големина число
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}
