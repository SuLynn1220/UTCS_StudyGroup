import java.util.*;

public class PF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long n = sc.nextLong();

            // a、b 紀錄往前兩個數字為多少
            long a = 1, b = 1;
            // 1、2 為初始值 所以 for 迴圈從 3 開始跑
            for (int i = 3; i <= n; i++) {
                // 兩者的值互換
                // 電腦會由上到下執行程式碼 如果直接 a = b、b = a + b 會讓兩個值相同
                // Ex : a = 3, b = 5
                // a = b -> a = 5, b = 5
                // b = a + b -> a = 5, b = 10 (正確答案應該為 8！)
                // 所以會需要一個 tmp 儲存某一個值 讓他不會因為互換消失
                // a = 3, b = 5
                // tmp = a + b = 8
                // a = b -> a = 5, b = 5
                // b = tmp -> b = 8
                long tmp = a + b;
                a = b;
                b = tmp;
            }

            System.out.println(b);
        }

        sc.close();
    }
}
