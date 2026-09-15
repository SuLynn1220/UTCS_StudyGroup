/*
解題思路 : 
    找字串中包含 "kick" 有幾個 -> 嘗試將每個字元當開頭並向後比對是不是 kick
*/
import java.util.*;

public class K_kick_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 比對用字串
        String tmp = "kick";
        // 計算數量
        int cnt = 0;
        // for 迴圈的終點位置要注意 不然比較字串時會超出範圍
        for (int i = 0; i <= s.length() - 4; i++) {
            // 紀錄現在檢查的字串是不是 kick
            // 初始狀態為 true 因為比較時發現不一樣比較容易判斷 並改為 false
            boolean f = true;
            // 向後推四個字串
            for (int j = 0; j < 4; j++) {
                // i + j : 字串 s 的起始位置為 i 要記得向後平移
                if (s.charAt(i + j) != tmp.charAt(j)) {
                    // 不相等改為 false
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
