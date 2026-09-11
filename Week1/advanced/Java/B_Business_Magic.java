import java.util.*;

public class B_Business_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] ex = new long[n];
        long base = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            base += Math.abs(a[i]);
            if (a[i] > 0) ex[i] = a[i];
            else ex[i] = 3 * a[i];
        }

        long mx = 0;
        long dp = 0;
        for (long x : ex) {
            dp += x;
            if (dp < 0) dp = 0;
            mx = Math.max(mx, dp);
        }

        System.out.println(base + mx);

        sc.close();
    }
}
