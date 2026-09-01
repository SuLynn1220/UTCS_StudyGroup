import java.util.*;

public class PG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 保持小的數字在前面
            // 方便找最大公因數時能都從小的開始進行
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            // 迴圈從後面往回跑 這樣地一個能同時整除 a 及 b 就是最大公因數
            for (int i = a; i >= 1; i--) {
                // % : 餘數 -> a % i == 0 a 除 i 的餘數是不是 0 (整除)
                if (a % i == 0 && b % i == 0) {
                    System.out.println(i);
                    // break : 跳脫迴圈 找到 for 迴圈的右括號繼續往下執行
                    // 第一個能整除的就是最大公因數 繼續讓 for 迴圈執行會把所有 a、b 的公因數都列出來
                    break;
                }
            }
        }

        sc.close();
    }
}
