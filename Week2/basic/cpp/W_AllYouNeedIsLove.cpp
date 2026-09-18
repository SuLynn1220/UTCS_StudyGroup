#include <bits/stdc++.h>
#define int long long
using namespace std;

int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

void solve() {
    string s1, s2; cin >> s1 >> s2;
    int n1 = stoll(s1, 0, 2), n2 = stoll(s2, 0, 2);

    int g = gcd(n1, n2);

    if (g == 1) cout << "Love is not all you need!\n";
    else cout << "All you need is love!\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    for (int t = 1; t <= T; t++) {
        cout << "Pair #" << t << ": ";
        solve();
    }
}