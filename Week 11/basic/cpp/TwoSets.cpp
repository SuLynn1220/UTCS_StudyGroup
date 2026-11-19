#include <bits/stdc++.h>
#define int long long
using namespace std;
 
void solve() {
    int n; cin >> n;
    int leftSum = 0, rightSum = 0;
    vector<int> left, right;
    for (int i = n; i >= 1; i--) {
        if (leftSum <= rightSum) {
            leftSum += i;
            left.push_back(i);
        } else {
            rightSum += i;
            right.push_back(i);
        }
    }
 
    if (leftSum == rightSum) {
        cout << "YES\n";
        cout << left.size() << "\n";
        for (int i : left) cout << i << " ";
        cout << "\n";
        cout << right.size() << "\n";
        for (int i : right) cout << i << " ";
    } else cout << "NO";
}
 
signed main() {
    ios::sync_with_stdio(0); cin.tie(0);
    solve();
}