import java.util.*;

public class PA_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // for 迴圈版本跑 T 筆測資
        for (int i = 0; i < T; i++) {
            String name = sc.next();
            System.out.println("Goodmorning " + name + "!");
        }

        sc.close();
    }
}
