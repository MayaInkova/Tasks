package ObjectAndClass;

// съставяме клас, който има  phrase, event author city
// списък с фрази и на рандом избира  трчбва да са колекции (лист или масив)


import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Message message = new Message();
        message.printMessages(n);
    }

    static class Message {
        String[] phrases = {"Excelent product","Such a great product","I always use that product"};
        String[] events = {" Not i feel good"," I have succeeded ","Makes miracles"};
        String[] authors= {"Diana","Maya","Ivan"};
        String[] cities= { "Burgas", "Varna","Sofia"};
        Random random = new Random ();

        void printMessages(int messages) {
            random.nextInt(this.phrases.length);
            for (int i = 0; i < messages; i++) {

                System.out.printf("%s %s %s - %s%n ",
                        this.phrases[  random.nextInt(this.phrases.length)], this.events[  random.nextInt(this.events.length)], this.authors[  random.nextInt(this.authors.length)],
                        this.cities[  random.nextInt(this.cities.length)]);
            }
        }
    }
}

