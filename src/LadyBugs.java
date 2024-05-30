import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//даден ни е масив и ни казва на кои позиции ще има калинка
// калинката ще си сменя позицията  0 дясно 1 ,
// ако калинката кацне върху др продължава да търси място,
// ако не намери полита, ако имаме празно място или - пропускаме команди

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] bugPositions = Arrays.stream(scanner.nextLine().split(""))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] field = new int[fieldSize];

        // първоначалните калинки

        for (int i = 0; i < bugPositions.length; i++) {
            int index = bugPositions[i];
            if (index >= 0 && index < field.length) {
                field[index] = 1;


                //sega prochitame lqvo dqsno komanda
            }
            String line = scanner.nextLine();
            while (!line.equals("end")) {
                String[] data = line.split(" ");
                index = Integer.parseInt(data[0]);
                String direction = data[1];
                int flyLength = Integer.parseInt(data[2]);

                if (index < 0 || index >= field.length || field[index] != 1) {
                    line = scanner.nextLine();
                    continue;

                }
                field[index] = 0;
                switch (direction) {
                    case "right":
                        index += flyLength;
                        // политане
                        while (index < fieldSize && field[index] == 1) {
                            index += flyLength;
                        }
                        //кацане
                        if (index < fieldSize) {
                            field[i] = 1;

                        }
                        break;
                    case "left":
                        index -= flyLength;
                        // политане
                        while (index >= 0 && field[index]==1) {
                            index -= flyLength;
                        }
                        if (index >=0) {
                            field[index] =1;
                        }
                        break;
                }


                line = scanner.nextLine();
            }


        }
    }
}

