import java.util.*;

public class PH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long n = sc.nextLong();

            if (n < 0) System.out.println(n * -1);
            else System.out.println(n);
        }

        sc.close();
    }
}
