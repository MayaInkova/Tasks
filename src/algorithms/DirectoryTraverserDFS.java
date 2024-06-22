package algorithms;

import java.io.File;

public class DirectoryTraverserDFS {

       // Рекурсивно обхождане на директория.
      //dir - текущата директория.
     //spaces - отстъп, използван за формат на извеждането.

    private static void traverseDir(File dir, String spaces) {

         // Ако текущият елемент е директория,
        // получаваме всичките й поддиректории и файлове
        if (dir.isDirectory()) {
            System.out.println(spaces + dir.getAbsolutePath());
            String[] children = dir.list();

            // За всяко дете посещаваме неговото поддърво
            for (String child : children) {
                traverseDir(new File(dir, child), spaces + "  ");
            }
        }
    }


       //  Обхожда и принтира дадена директория рекурсивно.
      //directoryPath - пътят до директорията, която
     //трябва да бъде обходена.

    public static void traverseDir(String directoryPath) {
        traverseDir(new File(directoryPath), new String());
    }

    public static void main(String[] args) {
        traverseDir("C:\\");
    }
}

