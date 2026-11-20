#include <bits/stdc++.h>
#define int long long
using namespace std;


const int N = 50 + 10;

void solve() {
    int n; cin >> n;
    vector a(n+2, vector<char>(n+2));
    vector dp(n+2, vector<bool>(n+2));
    for (int i = 1; i <= n; ++i) for (int j = 1; j <= n; ++j) cin >> a[i][j];
    for (int i = 1; i <= n; ++i) dp[n+1][i] = dp[i][n+1] = 1;
    for (int i = n; i >= 1; --i) {
        for (int j = n; j >= 1; --j) {
            dp[i][j] = (a[i][j] == '1') && (dp[i+1][j] || dp[i][j+1]);
        }
    }
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= n; ++j) {
            if (a[i][j] == '1' && !dp[i][j]) return cout << "NO\n", void();
        }
    }
    cout << "YES\n";
}

signed main() {
    cin.tie(0)->sync_with_stdio(0);
    int T = 1;
    cin >> T;
    while (T--) solve();
}