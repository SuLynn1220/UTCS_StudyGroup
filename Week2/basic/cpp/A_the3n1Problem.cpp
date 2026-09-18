#include <bits/stdc++.h>
#define int long long
using namespace std;

int a, b;

void solve() {
    int fir = a, sec = b;
    if (a > b) swap(a, b);
    int mx = 1;
    for (int i = a; i <= b; i++) {
        int cnt = 1;
        int n = i;
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            cnt++;
        }
        mx = max(mx, cnt);
    }

    cout << fir << " " << sec << " " << mx << "\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while (cin >> a >> b) {
        solve();
    }
}