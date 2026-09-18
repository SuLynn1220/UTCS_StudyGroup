import java.util.*;

public class U_Minesweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) break;

            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next().toCharArray();
            }

            int[][] ans = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == '*') {
                        for (int k = 0; k < 8; k++) {
                            int newI = i + dx[k];
                            int newJ = j + dy[k];
                            if (check(newI, newJ, n, m)) ans[newI][newJ]++;
                        }
                    }
                }
            }

            if (T > 1) System.out.println();
            System.out.printf("Field #%d:\n", T);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == '*') System.out.print("*");
                    else System.out.print(ans[i][j]);
                }
                System.out.println();
            }
            T++;
        }
        sc.close();
    }

    public static boolean check(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
