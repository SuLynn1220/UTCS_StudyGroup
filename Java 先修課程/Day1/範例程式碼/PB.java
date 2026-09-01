import java.util.*;

public class PB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String name = sc.next();
            // 字串比較是否相同
            // Java 的字串比較需用 .equals() 否則可能會沒有比較成功
            // 白話翻譯：name 有沒有等於 字串「"0"」　(零有用 "" 包起來所以他是字串型態哦) 
            // name.equals("0") -> 同等於 C++ 語言的 name == "0"
            if (name.equals("0")) {
                break;
            }
            System.out.println("Goodmorning " + name + "!");
        }

        sc.close();
    }
}
