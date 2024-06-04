package ObjectAndClass;
//програма, която извежда на стандартния изход броя на дните, часовете и минутите,
// които са изтекли от 1 януари 1970 година до момента на изпълнението на програмата.
//използваме клас System
import java.util.concurrent.TimeUnit;

public class TimeElapsedSinceEpoch {
    public static void main(String[] args) {
        // Вземане на текущото време в милисекунди от 1 януари 1970 година
        long currentTimeMillis = System.currentTimeMillis();

        // Преобразуване на милисекундите в дни, часове и минути
        long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis);
        long hours = TimeUnit.MILLISECONDS.toHours(currentTimeMillis) - TimeUnit.DAYS.toHours(days);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(currentTimeMillis));

        // Извеждане на резултата на стандартния изход
        System.out.println("Изтекли са:");
        System.out.println(days + " дни");
        System.out.println(hours + " часа");
        System.out.println(minutes + " минути");
    }
}
