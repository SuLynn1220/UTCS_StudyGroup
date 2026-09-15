/*
解題思路 : 
    找字串中包含 "kick" 有幾個 -> 嘗試將每個字元當開頭往後切四個 並查看是否為 kick
*/
import java.util.*;

public class K_kick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 計算數量
        int cnt = 0;
        // for 迴圈的終點位置要注意 不然切割字串時會超出範圍
        for (int i = 0; i <= s.length() - 4; i++) {
            // 切割字串並比較是不是 kick
            // substring(起始位置, 終點位置) -> 包頭不包尾
            String tmp = s.substring(i, i + 4);
            if (tmp.equals("kick")) {
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}