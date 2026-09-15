/*
解題思路 : 
    拿掉小數位數 -> 無條件捨去 (轉 int or long)
*/

import java.util.*;

public class J_JustRoundDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 用 double 接進來 如果用 int 會資料型態錯誤
        double x = sc.nextDouble();
        System.out.println((int)x);

        sc.close();
    }
}
