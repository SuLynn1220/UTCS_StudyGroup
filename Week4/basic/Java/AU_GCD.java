import java.util.*;

public class AU_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;

            int G = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i+1; j <= n; j++) {
                    G += gcd(i, j);
                }
            }

            System.out.println(G);
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
