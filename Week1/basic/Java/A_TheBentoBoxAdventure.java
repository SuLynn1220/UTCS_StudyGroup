import java.util.*;

public class A_TheBentoBoxAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 15;
        for (int i = 0; i < 4; i++) {
            int x = sc.nextInt();
            cnt -= x;
        }
        System.out.println(cnt);
        
        sc.close();
    }
}
