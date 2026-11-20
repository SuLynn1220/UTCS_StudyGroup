#include <bits/stdc++.h>
#define int long long
using namespace std;

void solve() {
    int n; cin >> n;
    int s = 0, mx = 0;
    for (int i = 1; i <= n; ++i) {
        int x; cin >> x;
        s += x;
        mx = max(mx, x);
    }
    if (s >= 2*mx) cout << s << "\n";
    else cout << 2*mx << "\n";
}

signed main() {
    cin.tie(0)->sync_with_stdio(0);
    solve();
}