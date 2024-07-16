package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// програма, която заменя всяко срещане на подниза "start" с "finish" в текстов файл.
public class ReplaceSubstring {
    public static void main(String[] args) {
        // Получаване на пътя до работния плот
        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + "\\Desktop\\PROGRAMM\\example.txt";
        Path path = Paths.get(desktopPath);

        // Създаване на файл, ако не съществува
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path.getParent());
                Files.write(path, "This is a start. Let's start now!".getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
                System.out.println("Файлът е създаден с начално съдържание.");
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        // Прочитане и модифициране на съдържанието на файла
        try {
            String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

            // Регулярен израз за замяна само на цели думи "start" с "finish"
            Pattern pattern = Pattern.compile("\\bstart\\b");
            Matcher matcher = pattern.matcher(content);
            content = matcher.replaceAll("finish");

            // Записване на промененото съдържание обратно във файла
            Files.write(path, content.getBytes(StandardCharsets.UTF_8));

            System.out.println("Замяната е успешна.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

