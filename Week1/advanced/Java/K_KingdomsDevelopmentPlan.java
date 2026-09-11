import java.util.*;

public class K_KingdomsDevelopmentPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for (int i = 0; i <= n; i++) G.add(new ArrayList<>());
        int[] in = new int[n + 1];
        while (m-->0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            G.get(u).add(v);
            ++in[v];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            if (in[i] == 0) pq.add(i);
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            int u = pq.poll();
            res.add(u);

            for (int v : G.get(u)) {
                --in[v];
                if (in[v] == 0) pq.add(v);
            }
        }

        if (res.size() < n) System.out.println("IMPOSSIBLE");
        else {
            for (int x : res) System.out.print(x + " ");
        }

        sc.close();
    }
}