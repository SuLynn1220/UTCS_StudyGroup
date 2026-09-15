/*
解題思路 : 
    小豬 -> 拿變數紀錄最大值
    其他動物 -> 拿陣列紀錄影響力 (不在乎動物是什麼 只在乎他的影響力是多少 所以只需要紀錄影響力)                   
*/

import java.util.*;

public class A_AnimalFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 存除了小豬以外的動物的影響力
        int[] influence = new int[n];
        // mx : 紀錄小豬最大影響力 / idx : 紀錄目前存到第幾個除了小豬以外動物的影響力
        int mx = 0, idx = 0;
        for (int i = 0; i < n; i++) {
            String animal = sc.next();
            int num = sc.nextInt();
            if (animal.equals("pig")) mx = Math.max(mx, num);
            else {
                influence[idx] = num;
                idx++;
            }
        }

        // 存總影響程度
        // 影響力最大值有可能到 1e8 (10^8) 動物最多有 1e5 (10^5) 隻
        // 這樣總和最大可能到 1e13 (10^13) 已經超出 int 可儲存範圍 (~2e9)
        // 所以要記得用 long
        long res = mx;
        // 計算總影響程度 (小於小豬最大值就會被收編)
        for (int i = 0; i < n; i++) {
            if (influence[i] < mx) res += influence[i];
        }

        System.out.println(res);

        sc.close();
    }
}