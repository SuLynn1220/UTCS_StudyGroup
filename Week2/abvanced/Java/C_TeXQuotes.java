import java.util.*;

public class C_TeXQuotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '\"') {
                    count++;
                    sb.append(count % 2 == 0 ? "\'\'" : "``");
                } else {
                    sb.append(c);
                }
            }

            list.add(sb.toString());
        }

        for (String l : list) System.out.println(l);
        
        sc.close();
    }
}
