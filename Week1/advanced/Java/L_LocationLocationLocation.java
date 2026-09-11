import java.util.*;

public class L_LocationLocationLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(x[(n - 1) / 2] + " " + y[(n - 1) / 2]);

        sc.close();
    }
}