import java.util.*;

public class PC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String name = sc.next();
            System.out.println("Goodmorning " + name + "!");
        }

        sc.close();
    }
}
