#include <bits/stdc++.h>
#define int long long
using namespace std;

vector<int> fib;

void init(int n) {
    fib.clear();
    fib.push_back(1);
    fib.push_back(2);
    while (fib.back() <= n) {
        int len = fib.size();
        int a = fib[len-1], b = fib[len-2];
        fib.push_back(a + b);
    }
}

void solve() {
    int n; cin >> n;
    cout << n << " = ";
    init(n);
    string res = "";
    for (int i = (int)fib.size() - 1; i >= 0; i--) {
        if (n >= fib[i]) {
            res += "1";
            n -= fib[i];
        } else if (!res.empty()) res += "0";
    }
    cout << res << " (fib)\n";
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    while (T--) solve();
}