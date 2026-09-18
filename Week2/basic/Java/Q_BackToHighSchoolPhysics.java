import java.util.*;

public class Q_BackToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            System.out.println(v * t * 2);
        }
        sc.close();
    }
}
