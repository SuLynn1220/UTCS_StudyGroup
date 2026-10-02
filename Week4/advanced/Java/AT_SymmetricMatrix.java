import java.util.*;

public class AT_SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            sc.nextLine();
            int n = Integer.parseInt(sc.nextLine().split(" ")[2]);
            long[][] arr = new long[n][n];
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // 判斷對角是否相同 負的也不行
                    if (arr[i][j] != arr[n-i-1][n-j-1] || arr[i][j] < 0) {
                        flag = false;
                        break;
                    }
                }
            }
            System.out.printf("Test #%d: %s.\n", t, flag ? "Symmetric" : "Non-symmetric");
        }
        sc.close();
    }
}