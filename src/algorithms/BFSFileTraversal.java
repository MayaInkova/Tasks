import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

//  Използвайки опашка правим  пълно обхождане на всички директории на твърдия  диск и ги отпечатва на конзолата.
//  алгоритъма "обхождане в ширина" – Breadth-First-Search (BFS)

public class BFSFileTraversal {
    public static void main(String[] args) {
        //  началната директория за обхождане
        String rootPath = "C:\\";  // или друга директория
        File root = new File(rootPath);

        // Извикване на метода за BFS обхождане на директории
        bfsTraversal(root);
    }

    public static void bfsTraversal(File root) {
        // Проверка дали началният път е валидна директория
        if (!root.isDirectory()) {
            System.out.println(root.getAbsolutePath() + " is not a directory.");
            return;
        }

        // Опашка за обхождане на директориите
        Queue<File> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            File current = queue.poll();
            System.out.println(current.getAbsolutePath());

            File[] filesAndDirs = current.listFiles();
            if (filesAndDirs != null) {
                for (File file : filesAndDirs) {
                    if (file.isDirectory()) {
                        queue.add(file);
                    }
                }
            }
        }
    }
}