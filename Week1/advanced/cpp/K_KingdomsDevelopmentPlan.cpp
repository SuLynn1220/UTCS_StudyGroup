#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n, m; cin >> n >> m;
    vector<vector<int>> G(n+1);
    vector<int> in(n+1);
    for (int i = 0; i < m; ++i) {
        int u, v; cin >> u >> v;
        G[u].push_back(v);
        ++in[v];
    }

    priority_queue<int, vector<int>, greater<int>> pq;
    for (int i = 1; i <= n; ++i) {
        if (!in[i]) pq.push(i);
    }

    vector<int> ans;
    while (!pq.empty()) {
        int u = pq.top(); pq.pop();
        ans.push_back(u);
        for (int v : G[u]) {
            --in[v];
            if (!in[v]) pq.push(v);
        }
    }

    if (ans.size() < n) cout << "IMPOSSIBLE";
    else for (int x : ans) cout << x << " ";

    cout << "\n";
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    solve();
}
