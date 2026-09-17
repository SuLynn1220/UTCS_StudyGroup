#include <bits/stdc++.h>
using namespace std;

/*
    解題思路 : 
        1. 手玩會發現私乎總是能用到最極限的狀況 (也就是剩下的球瓶都亂放最後一排也不夠用)
            例如 white = 3, black = 8
            可放成 1w 2w 3b 4b
        
        2. 怎麼辦我就亂猜 w+b >= n*(n+1)/2 中最大的 n 直接就是答案嗎 ? (其中 n 的排數)
            當然不是, 我們可以嘗試用簡單邏輯驗證 :
                假設 n = x(總排數), tot(總球瓶數) = x*(x+1)/2, w(白球瓶) b(黑球瓶) = tot - w
                可以列舉一下 w = 1, 2, 3...　的情況
                會發現由於每一排有 1, 2, 3, 4, ..., x 個球瓶
                對於 w <= x, 總能只接選一排塞進去,
                w = x+1 就選 第 1, x 排放白色
                w = x+2 就選 第 2, x 排放白色
                ...
                發現 w 總能夠被放進去, 那麼題目限制的同一排同顏色根本是假議題, 因為我們總是有辦法擺出
                來 (w 選好要放的排其他都用黑色填就好)
*/
void solve() {
    int w, b; cin >> w >> b;
    int tot = w + b;
    
    int x = 1; // 目前在考慮哪一排
    int ans = 0; // 輔助存最終答案

    while (1) {
        tot -= x;
        // 如果不夠用了那代表最多只能到 x-1 排
        if (tot < 0) {
            ans = x-1;
            break;
        }
        ++x;
    }

    cout << ans << "\n";
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int T; cin >> T;
    while (T--) solve();
}
