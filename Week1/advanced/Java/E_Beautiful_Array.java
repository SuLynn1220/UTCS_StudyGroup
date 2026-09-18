import java.util.*;

public class E_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = b, a2 = b, a3 = b;
        int tot = 3 * b;

        // 如果目前總和「大於」目標總和 (平均數 * 3) 將「左手邊」的數「減去」目前「多餘」的部分
        if (tot > 3 * a) a1 -= tot - 3 * a;

        // 如果目前總和「小於」目標總和 (平均數 * 3) 將「右手邊」的數「加上」目前「少於」的部分
        if (tot < 3 * a) a3 += 3 * a - tot;

        System.out.println(3);
        System.out.println(a1 + " " + a2 + " " + a3);

        sc.close();
    }
}
