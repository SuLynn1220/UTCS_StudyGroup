#include <bits/stdc++.h>
using namespace std;

void solve() {
    int a, b; cin >> a >> b;
    int a1 = b, a2 = b, a3 = b;
    int tot = 3 * b;
    while (tot > 3 * a) {
        --tot;
        --a1;
    }

    while (tot < 3 * a) {
        ++tot;
        ++a3;
    }

    cout << 3 << "\n" << a1 << " " << a2 << " " << a3 << "\n";
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    solve();
}
