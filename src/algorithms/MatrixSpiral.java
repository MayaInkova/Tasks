package algorithms;

import java.util.Scanner;
//запълва квадратна матрица (n x n) със спираловиден модел,
// започвайки от центъра и движейки се навън по спиралата. След това отпечатва тази матрица.


//Този метод отпечатва квадратната матрица, като подравнява стойностите по ширина от 3 символа за по-добър изглед.
public class MatrixSpiral {
    public static void printMatrix(int[][] matrix, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.printf("%3d ", matrix[i][j]);

            }

            System.out.println();

        }

    }


    //Този метод запълва квадратната матрица със спираловиден модел, започвайки от центъра
    public static void fillMatrix(int[][] matrix, int n) {

        int count = n * n; // Общият брой елементи в матрицата
        int positionX = n / 2; // Начална позиция на X (център)
        int positionY = n % 2 == 0 ? n / 2 - 1 : n / 2; // Начална позиция на Y (център за четни и нечетни n)
        int direction = 0; // Направление на движение (0 = надолу, 1 = наляво, 2 = нагоре, 3 = надясно)
        int stepsCount = 1; // Броят стъпки в текущата посока
        int stepPosition = 0; // Брой стъпки, направени в текущата посока
        int stepChange = 0; // Промяна на броя стъпки след две промени на посоката

        for (int i = 0; i < count; i++) {
            matrix[positionY][positionX] = i; // Поставя текущия индекс в матрицата

            if (stepPosition < stepsCount) {
                stepPosition++;
            } else {
                stepPosition = 1;
                if (stepChange == 1) {
                    stepsCount++; // Увеличава броя стъпки на всеки два пъти промяна на посоката
                }
                stepChange = (stepChange + 1) % 2;
                direction = (direction + 1) % 4; // Промяна на посоката
            }



            // Преместване в новата позиция в зависимост от текущата посока
            switch (direction) {

                case 0: positionY++; break;

                case 1: positionX--; break;

                case 2: positionY--; break;

                case 3: positionX++; break;

            }

        }

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N = ");

        int n = input.nextInt();



        int[][] matrix = new int[n][n];// Създава квадратна матрица с размер n x n

        fillMatrix(matrix, n); // Запълва матрицата със спираловиден модел
        printMatrix(matrix, n); // Отпечатва матрицата
    }
}

