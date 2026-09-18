#include <bits/stdc++.h>
#define int long long
using namespace std;

string txt[] = {"``", "''"};

void solve() {
    char c;
    bool f = 1;
    while (cin.get(c)) {
        if (c == '"') cout << txt[f ^= 1];
        else cout << c;
    }
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    solve();
}