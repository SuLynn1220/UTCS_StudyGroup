import java.util.*;

public class C_TeXQuotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            for (char c : s.toCharArray()) {
                if (c == '"') {
                    cnt++;
                    if (cnt % 2 == 0) System.out.print("''");
                    else System.out.print("``");
                } else System.out.print(c);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
