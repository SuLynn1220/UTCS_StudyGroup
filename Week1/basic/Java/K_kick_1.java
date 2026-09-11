import java.util.*;

public class K_kick_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String tmp = "kick";
        int cnt = 0;
        for (int i = 0; i <= s.length() - 4; i++) {
            boolean f = true;
            for (int j = 0; j < 4; j++) {
                if (s.charAt(i + j) != tmp.charAt(j)) {
                    f = false;
                    break;
                }
            }            
            if (f) cnt++;
        }

        System.out.println(cnt);

        sc.close();
    }
}
