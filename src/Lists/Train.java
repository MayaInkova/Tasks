package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Влак на 1 линия получаваме лист от вагони на следващият ред макс. капацитет на вагона
// после добавчяме вагон  add операцията и намираме съществуващ вагон кохто да хване определен брои пътници


public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String  line = scanner.nextLine();
        while (!line.equals("end")) {{
             String  [] data= line.split("\\s+");
             if (data [0].equals("Add")) {
                 train.add(Integer.parseInt(data [1]));

             }else  {
                 int passengers = Integer.parseInt(data[0]);
                 for (int i = 0; i <train.size() ; i++) {
                     if (train.get(i) + passengers <= maxCapacity) {
    train.set(i,train.get(i)+ passengers + passengers );
    break;

                     }

                 }
             }
            System.out.println(train.toString().replaceAll("\\[\\]\\,", " "));
        }
}
    }
}

