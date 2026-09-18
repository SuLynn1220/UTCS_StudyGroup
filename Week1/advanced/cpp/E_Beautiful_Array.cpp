/*
    解題思路 :
        給陣列中的中位數及平均數求一個完整陣列 -> 把陣列長度控制在 3 並根據平均數改變左右兩邊數值大小
        <NOTICE>
        此種題型輸出樣式不一定要跟題目相同 (: If there are multiple solutions, you can print any.)
        這種狀況就可以不理範例輸出 只要能達到題目目的即可
*/

#include <bits/stdc++.h>
using namespace std;

void solve() {
    int a, b; cin >> a >> b;
    // 所有數都預設是中位數
    int a1 = b, a2 = b, a3 = b;
    // tot : 目前總和
    int tot = 3 * b;

    // 如果目前總和「大於」目標總和 (平均數 * 3) 將「左手邊」的數「減去」目前「多餘」的部分
    if (tot > 3 * a) a1 -= tot - 3 * a;

    // 如果目前總和「小於」目標總和 (平均數 * 3) 將「右手邊」的數「加上」目前「少於」的部分
    if (tot < 3 * a) a3 += 3 * a - tot;

    cout << 3 << "\n" << a1 << " " << a2 << " " << a3 << "\n";
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    solve();
}
