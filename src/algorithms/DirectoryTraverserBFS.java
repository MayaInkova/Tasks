package algorithms;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;


// Примерен клас, който обхожда дадена директория
 //на базата на алгоритъма за Обхождане в Ширина (Breadth-First-Search, BFS).

public class DirectoryTraverserBFS {


    // Обхожда и принтира дадена директория с BFS.
     //startDir - пътят до директорията, която
         // трябва да бъде обходена.

    public static void traverseDir(String startDirectory) {
        Queue<File> visitedDirsQueue = new LinkedList<File>();
        visitedDirsQueue.add(new File(startDirectory));

        while (visitedDirsQueue.size() > 0) {
            File currentDir = visitedDirsQueue.remove();
            System.out.println(currentDir.getAbsolutePath());

            File[] children = currentDir.listFiles();
            if (children != null) {
                for (File child : children) {
                    if (child.isDirectory()) {
                        visitedDirsQueue.add(child);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        traverseDir("C:\\");
    }
}