import java.util.*;

public class AH_CanYouSolveIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int count1 = sum(x1 + y1) + x1;
            int count2 = sum(x2 + y2) + x2;
            System.out.printf("Case %d: %d", i,  count2 - count1);
            System.out.println();
        }
        sc.close();
    }

    public static int sum(int x) {
        return (x + 1) * x / 2;
    }
}
