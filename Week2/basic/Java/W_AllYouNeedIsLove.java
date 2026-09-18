import java.util.*;

public class W_AllYouNeedIsLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

            // 十進位轉二進位
            long a = Long.parseLong(s1, 2);
            long b = Long.parseLong(s2, 2);

            // 找最大公因數
            long c = gcd(a, b);
            
            if (c == 1) System.out.printf("Pair #%d: Love is not all you need!\n", i);
            else System.out.printf("Pair #%d: All you need is love!\n", i);
        }
        sc.close();
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
