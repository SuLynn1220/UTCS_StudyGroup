import java.util.*;

public class K_kick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int cnt = 0;
        for (int i = 0; i <= s.length() - 4; i++) {
            String tmp = s.substring(i, i + 4);
            if (tmp.equals("kick")) {
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}