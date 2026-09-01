import java.util.*;

public class PG_gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = gcd(a, b);
            System.out.println(res);
        }

        sc.close();
    }

    // 輾轉相除法 遞迴方式解
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
        // 19 ~ 20 等價寫法
        // return b == 0 ? a : gcd(b, a % b);
    }
}
