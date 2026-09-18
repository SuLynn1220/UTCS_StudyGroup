import java.util.*;

public class L_Hartals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int[] arr = new int[p];
            for (int i = 0; i < p; i++) arr[i] = sc.nextInt();
            boolean[] seen = new boolean[n+1];
            int  count = 0;
            for (int i : arr) {
                int curr = i;
                while (curr <= n) {
                    if (curr % 7 == 6) seen[curr] = true;
                    if (curr % 7 == 0) seen[curr] = true;
                    if (!seen[curr]) count++;
                    seen[curr] = true;
                    curr += i;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
