#include <bits/stdc++.h>
using namespace std;

void solve() {
    long long w, b; cin >> w >> b;
    long long tot = w + b;
    
    int ans = 0;
    for (int i = 1; ; ++i) {
        tot -= i;
        if (tot < 0) {
            ans = i-1;
            break;
        }
    }
    cout << ans << "\n";
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int T; cin >> T;
    while (T--) solve();
}
