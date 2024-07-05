import java.io.File;
import java.util.Stack;
//  опашка реализираща пълно обхождане на всички директории на твърдия  диск и ги отпечатва на конзолата.
// е алгоритъма "обхождане в дълбочина" – Depth-First-Search (DFS)

public class DFSFileTraversal {
    public static void main(String[] args) {
        //  началната директория за обхождане
        String rootPath = "C:\\";  // или друга директория
        File root = new File(rootPath);

        // Извикване на метода за DFS обхождане на директории
        dfsTraversal(root);
    }

    public static void dfsTraversal(File root) {
        // Проверка дали началният път е валидна директория
        if (!root.isDirectory()) {
            System.out.println(root.getAbsolutePath() + " is not a directory.");
            return;
        }

        // Стек за обхождане на директориите
        Stack<File> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            File current = stack.pop();
            System.out.println(current.getAbsolutePath());

            File[] filesAndDirs = current.listFiles();
            if (filesAndDirs != null) {
                for (File file : filesAndDirs) {
                    if (file.isDirectory()) {
                        stack.push(file);
                    }
                }
            }
        }
    }
}