import java.util.*;

public class PA_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // while 迴圈版本跑 T 筆測資
        while (T-->0) {
            String name = sc.next();
            System.out.println("Goodmorning " + name + "!");
        }
        
        sc.close();
    }
}