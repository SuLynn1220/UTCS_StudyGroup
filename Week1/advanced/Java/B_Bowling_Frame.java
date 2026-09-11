import java.util.*;

public class B_Bowling_Frame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            long w = sc.nextLong();
            long b = sc.nextLong();
            long tot = w + b;

            int ans = 0;
            int i = 1;
            while (true) {
                tot -= i;
                
                if (tot < 0) {
                    ans = i - 1;
                    break;
                }
                
                ++i;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
