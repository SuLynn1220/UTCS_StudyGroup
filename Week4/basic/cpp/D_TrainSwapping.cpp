#include <bits/stdc++.h>
#define int long long
using namespace std;

void solve() {
    int L; cin >> L;
    vector<int> v(L);
    for (int& x : v) cin >> x;

    int op = 0;
    for (int i = 0; i < L - 1; i++) {
        for (int j = 0; j < L - i - 1; j++) {
            if (v[j] > v[j + 1]) {
                op++;
                swap(v[j], v[j + 1]);
            }
        }
    }

    cout << "Optimal train swapping takes " << op << " swaps.\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    while (T--) solve();
}