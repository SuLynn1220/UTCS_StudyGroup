import java.util.*;

public class F_FibonaccimalBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int n = sc.nextInt();

            // 建立一個小於等於n的費氏數列
            List<Integer> fib = new ArrayList<>();
            fib.add(1);
            fib.add(2);
            while (fib.get(fib.size()-1) <= n) {
                fib.add(fib.get(fib.size()-1) + fib.get(fib.size()-2));
            }

            int curr = n;
            StringBuilder sb = new StringBuilder();
            boolean one = false; // 紀錄數字開始沒
            // 從大到小往回找
            for (int i = fib.size()-1; i >= 0; i--) {
                if (fib.get(i) <= curr) {
                    sb.append("1");
                    curr -= fib.get(i); // 一旦減掉了下一個能加進來的數字就不會大於現在的數字
                    one = true;
                } else if (one) { // 開始有數字符合才可加零
                    sb.append("0");
                }
            }

            System.out.println(n + " = " + sb.toString() + " (fib)");
        }
        sc.close();
    }
}
