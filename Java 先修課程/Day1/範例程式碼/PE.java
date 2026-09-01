import java.util.*;

public class PE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            // 二進制規則
            // 一直跟 2 取餘數並把取餘數的結果存進字串的開頭 及為二進制的結果
            // 跟 2 取完餘數要除 2 

            // res 儲存轉換為二進制後的結果
            String res = "";
            while (n > 0) {
                int mod = n % 2;
                // 加在字串開頭
                res = mod + res;
                n /= 2;
            }

            System.out.println(res);
        }

        sc.close();
    }    
}
