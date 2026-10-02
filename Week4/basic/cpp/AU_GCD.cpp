#include <bits/stdc++.h>
#define int long long
using namespace std;

int n;

int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

void solve() {
    int G = 0;
    for (int i = 1; i < n; i++) {
        for (int j = i + 1; j <= n; j++) G += gcd(i, j);
    }

    cout << G << "\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while (cin >> n && n != 0) solve();
}