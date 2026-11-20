#include <bits/stdc++.h>
#define int long long
using namespace std;
 
const int INF = 1e18;
 
void solve() {
    int n; cin >> n;
    vector<int> v(n);
    for (int& x : v) cin >> x;    
 
    sort(v.begin(), v.end());
 
    int curr = 0;
    for (int x : v) {
        if (x <= curr + 1) curr += x;
        else {
            cout << curr + 1;
            return;
        }
    }
 
    cout << curr + 1;
}
 
signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    solve();
}