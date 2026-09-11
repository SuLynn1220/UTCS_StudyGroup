#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n; cin >> n;
    vector<long long> a(n);
    vector<long long> ex(n);
    long long base = 0;
    
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
        base += abs(a[i]);
        if (a[i] > 0) ex[i] = a[i];
        else ex[i] = 3 * a[i];
    }

    long long mx = 0;
    long long dp = 0;
    for (long long x : ex) {
        dp += x;
        if (dp < 0) dp = 0;
        mx = max(mx, dp);
    }
    cout << base + mx << "\n";
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    solve();
}
