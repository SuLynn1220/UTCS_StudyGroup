import java.util.*;

public class D_TrainSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int l = sc.nextInt();
            int[] line = new int[l];
            for (int i = 0; i < l; i++) line[i] = sc.nextInt();

            int count = 0;
            for (int i = 0; i < l-1; i++) {
                for (int j = 0; j < l-i-1; j++) {
                    if (line[j] > line[j+1]) {
                        count++;
                        int tmp = line[j];
                        line[j] = line[j+1];
                        line[j+1] = tmp;
                    }
                }
            }

            System.out.println("Optimal train swapping takes " + count + " swaps.");
        }
        sc.close();
    }
}
