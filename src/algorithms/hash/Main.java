package algorithms.hash;

import java.util.HashMap;
import java.util.Map;

public class Main {

        public static void main(String[] args) {
            Map<Name, Person> mapOfPeople = new HashMap<>();

            Name name1 = new Name("Ivan", "Ivanov", "Ivanov");
            Name name5 = new Name("Ivan", "Georgiev", "Ivanov");
            Name name6 = new Name("Ivan", "Georgiev", "Ivanov"); // Нов обект с нов адрес

            Person p1 = new Person(name1, 25);
            Person p5 = new Person(name5, 45);
            Person p6 = new Person(name6, 90);

            mapOfPeople.put(name1, p1);
            mapOfPeople.put(name5, p5);
            mapOfPeople.put(name6, p6); // Ще замени p5, защото name5 и name6 са логически равни

            // Търсим човек с ново име, но със същите стойности
            Person foundPers = mapOfPeople.get(new Name("Ivan", "Georgiev", "Ivanov"));
            if (foundPers == null) {
                System.out.println("No such person.");
            } else {
                System.out.println("Years of person are: " + foundPers.getYears());
            }
        }
    }

