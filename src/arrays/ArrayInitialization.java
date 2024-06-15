package arrays;
// програма, която създава масив с 20 елемента от целочислен тип и инициализира всеки от елементите със стойност
// равна на индекса на елемента умножен по 5. Елементите на масива да се изведат на конзолата.
public class ArrayInitialization {
    public static void main(String[] args) {
        // Създаване на масив с 20 елемента от целочислен тип
        int[] array = new int[20];

        // Инициализиране на всеки елемент на масива
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        // Извеждане на елементите на масива на конзолата
        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент " + i + ": " + array[i]);
        }
    }
}