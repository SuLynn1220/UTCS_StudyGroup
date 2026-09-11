import java.util.*;
 
public class A_AnimalFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] influence = new int[n];
        int mx = 0, idx = 0;
        for (int i = 0; i < n; i++) {
            String animal = sc.next();
            int num = sc.nextInt();
            if (animal.equals("pig")) mx = Math.max(mx, num);
            else influence[idx++] = num;
        }

        long res = mx;
        for (int i = 0; i < n; i++) {
            if (influence[i] < mx) res += influence[i];
        }
        System.out.println(res);

        sc.close();
    }
}