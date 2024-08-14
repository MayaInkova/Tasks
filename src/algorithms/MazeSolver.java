package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class MazeSolver {
    // Масиви за посоките на движение: нагоре, надолу, наляво, надясно
    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};

    // Метод за проверка дали дадена клетка е в рамките на лабиринта и проходима
    private static boolean isValid(int[][] maze, boolean[][] visited, int row, int col) {
        int n = maze.length;
        int m = maze[0].length;
        return (row >= 0 && row < n && col >= 0 && col < m && maze[row][col] == 0 && !visited[row][col]);
    }

    // Метод за намиране на най-краткия път с BFS
    public static int shortestPath(int[][] maze, int startX, int startY, int endX, int endY) {
        int n = maze.length;
        int m = maze[0].length;
        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0}); // Тук 0 е броят на стъпките
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int steps = current[2];

            // Ако сме достигнали крайната точка
            if (row == endX && col == endY) {
                return steps;
            }

            // Проверка на всички съседни клетки
            for (int i = 0; i < 4; i++) {
                int newRow = row + rowDir[i];
                int newCol = col + colDir[i];

                if (isValid(maze, visited, newRow, newCol)) {
                    queue.add(new int[]{newRow, newCol, steps + 1});
                    visited[newRow][newCol] = true;
                }
            }
        }

        // Ако няма път до крайната точка
        return -1;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        int startX = 0, startY = 0;
        int endX = 4, endY = 4;

        int result = shortestPath(maze, startX, startY, endX, endY);
        if (result != -1) {
            System.out.println("Най-краткият път има дължина: " + result);
        } else {
            System.out.println("Няма възможен път до крайната точка.");
        }
    }
}

