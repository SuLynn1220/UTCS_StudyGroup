#include <bits/stdc++.h>
#define int long long
using namespace std;

int n, m;
int dx[] = {-1, 1, 0, 0, -1, -1, 1, 1};
int dy[] = {0, 0, -1, 1, 1, -1, 1, -1};

bool valid(int i, int j) {
    return i >= 0 && i < n && j >= 0 && j < m;
}

void solve() {
    vector<string> grid(n);
    for (auto& x : grid) cin >> x;
    
    vector<vector<int>> cnt(n, vector<int>(m));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == '*') {
                for (int d = 0; d < 8; d++) {
                    int newI = i + dx[d];
                    int newJ = j + dy[d];
                    if (valid(newI, newJ)) cnt[newI][newJ]++;
                }
            }
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == '*') cout << "*";
            else cout << cnt[i][j];
        }
        cout << "\n";
    }
}

signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T = 1;
    while (cin >> n >> m && !(n == 0 && m == 0)) {
        if (T > 1) cout << "\n";
        cout << "Field #" << T++ << ":\n";
        solve();
    }
}