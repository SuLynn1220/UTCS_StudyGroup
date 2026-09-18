#include <bits/stdc++.h>
#define int long long
using namespace std;

void solve() {
    int n, p; cin >> n >> p;
    vector<bool> days(n + 1);
    while (p--) {
        int x; cin >> x;
        for (int i = x; i <= n; i += x) {
            days[i] = true;
        }
    }
    
    int cnt = 0;
    for (int i = 1; i <= n; i++) {
        if (i % 7 == 0 || i % 7 == 6) continue;
        if (days[i]) cnt++;
    }

    cout << cnt << "\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    while (T--) solve();
}