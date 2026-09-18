import java.util.*;

public class A_the3n1Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 大小有可能相反 要互換
            int first = Math.min(a, b);
            int second = Math.max(a, b);
            int maxLen = 0;
            for (int i = first; i <= second; i++) {
                int len = 1;
                int n = i;
                while (n > 1) {
                    if (n % 2 == 0) n /= 2;
                    else n = 3 * n + 1;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
            System.out.printf("%d %d %d\n", a, b, maxLen);
        }
        sc.close();
    }
}
