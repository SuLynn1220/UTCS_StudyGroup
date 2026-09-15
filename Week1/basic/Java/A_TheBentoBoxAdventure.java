/*
解題思路 : 
    找 1 ~ 5 中少的那一位數 -> 1 ~ 5 相加後減去其他數字剩餘者就是答案
*/
import java.util.*;

public class A_TheBentoBoxAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 ~ 5 total = 15
        int cnt = 15;
        for (int i = 0; i < 4; i++) {
            int x = sc.nextInt();
            // 減去所有數字
            cnt -= x;
        }
        System.out.println(cnt);
        
        sc.close();
    }
}
