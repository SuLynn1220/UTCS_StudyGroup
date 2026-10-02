#include <bits/stdc++.h>
#define int long long
using namespace std;

void solve() {
    char c1, c2; cin >> c1 >> c2;
    int n; cin >> n;
    vector<int> v(n * n);
    bool valid = true;
    for (int& x : v) {
        cin >> x;
        if (x < 0) valid = false;
    }

    if (!valid) {
        cout << "Non-symmetric.\n";
        return;
    }

    vector<int> re = v;
    reverse(re.begin(), re.end());
    if (v == re) cout << "Symmetric.\n";
    else cout << "Non-symmetric.\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    for (int t = 1; t <= T; t++) {
        cout << "Test #" << t << ": ";
        solve();
    }
}