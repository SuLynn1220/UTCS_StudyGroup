import java.util.*;

public class PD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 這題隱藏測資中有空白 需要用 nextLine 接輸入
        // next() 遇到空白就會停止接輸入了
        // Ex：input = "asd fdse"
        // next() -> asd (遇到空格就停止)
        // nextLine() -> asd fdse (會把整行文字接起來包含空白)
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            // 用來暫時儲存是不是迴文
            // 如果不是迴文就改成 false
            boolean isP = true;
            // 迴文 = 翻轉後相同 -> 前後相同
            // i = 從最「左邊」開始一路向「右」到中間
            // j = 從最「右邊」開始一路想「左」到中間
            int i = 0, j = s.length() - 1;
            while (i < j) {
                // 兩邊不一樣就代表不是迴文
                // break = 跳離這個迴圈直接從這個迴圈的右括號繼續執行程式碼
                if (s.charAt(i) != s.charAt(j)) {
                    isP = false;
                    break;
                }
                // 兩邊都向中間移動一格
                i++;
                j--;
            }

            if (isP) System.out.println("Yes");
            else System.out.println("No");
        }

        sc.close();
    }
}
