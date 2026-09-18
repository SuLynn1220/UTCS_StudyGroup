#include <bits/stdc++.h>
#define int long long
using namespace std;

void solve() {
    int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
    int s1 = x1 + y1, s2 = x2 + y2;
    int step1 = (1 + s1) * s1 / 2, step2 = (1 + s2) * s2 / 2;
    step1 += x1;
    step2 += x2;

    cout << abs(step2 - step1) << "\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    for (int t = 1; t <= T; t++) {
        cout << "Case " << t << ": ";
        solve();
    }
}