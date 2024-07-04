package algorithms;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
//Деца , които в кръг си подават горещ картоф ,когато на едно дете му стане топло подава катрофа на следващия и излиза от играта. Броим н дете на всяко н прехвърляне.
//Кой ще остане последен.
// Ako  имаме 3 деца на всяко второ някой изгаря
//
public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String []  children = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque <String> queue = new ArrayDeque<>();

        Collections.addAll(queue,children);
        
        while (queue.size()>1) {
            for (int i = 1; i <n  ; i++) {
                String child= queue.remove();
                queue.offer(child);
                
            }
            String name = queue.remove();
            System.out.println("Removed" + name );
        }
        String name = queue.peek();
        System.out.println("Last in:" + name);
    }
    
}
