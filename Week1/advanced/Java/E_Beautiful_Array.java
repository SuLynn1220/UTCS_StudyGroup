import java.util.*;

public class E_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = b, a2 = b, a3 = b;
        int tot = 3 * b;

        while (tot > 3 * a) {
            tot--;
            a1--;
        }

        while (tot < 3 * a) {
            tot++;
            a3++;
        }

        System.out.println(3);
        System.out.println(a1 + " " + a2 + " " + a3);

        sc.close();
    }
}
