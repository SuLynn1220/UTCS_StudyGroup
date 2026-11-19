#include <bits/stdc++.h>
#define int long long
using namespace std;
 
void solve() {
    int n; cin >> n;
    vector<int> v(n);
    for (int& x : v) cin >> x;
 
    int res = 0;
    for (int i = 1; i < n; i++) {
        if (v[i-1] > v[i]) {
            res += v[i-1] - v[i];
            v[i] = v[i-1];
        }
    }
 
    cout << res;
}
 
signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    solve();
}