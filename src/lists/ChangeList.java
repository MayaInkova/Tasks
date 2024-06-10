package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Програма прочитаща  лист от конзолата и получава команди за маниполиране на листа
// да изтрием всички елементи когато са равни
//поставяме елемент на дадена позиция


public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Delete":
                    int element = Integer.parseInt(data[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == element) {
                            numbers.remove(i);
                            i--;

                        }
                    }
                    break;
                case "Insert":
                    element = Integer.parseInt(data[1]);
                    int position = Integer.parseInt(data[2]);
                    numbers.add(position, element);
                    break;


            }
        }
        numbers.forEach(el -> System.out.println(el +  " "));


    }
}




