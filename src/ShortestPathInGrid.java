

//Дадена е матрица n x m, която съдържа числа.
// Всеки елемент в матрицата представлява разход за преминаване през съответната клетка.
// Трябва да се намери най-краткият път от горния ляв ъгъл на матрицата (клетка [0, 0])
// до долния десен ъгъл на матрицата (клетка [n-1, m-1]). Можете да се движите само надолу или надясно във всяка стъпка.


public class ShortestPathInGrid {
    // Метод за намиране на най-краткия път в матрица
    public static int minPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Създаваме двумерен масив за съхраняване на минималния разход
        int[][] dp = new int[n][m];

        // Инициализираме стартовата клетка
        dp[0][0] = matrix[0][0];

        // Запълваме първия ред
        for (int i = 1; i < m; i++) {
            dp[0][i] = dp[0][i - 1] + matrix[0][i];
        }

        // Запълваме първата колона
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + matrix[i][0];
        }

        // Запълваме останалата част от масива
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }

        // Връщаме минималния разход за достигане на долния десен ъгъл
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int result = minPathSum(matrix);
        System.out.println("Най-краткият път е: " + result);
    }
}