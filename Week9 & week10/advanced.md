# [560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/) 
>前綴和 + hashmap
```cpp
class Solution {
public:
    int subarraySum(vector<int>& a, int k) {
        int n = a.size();
        vector<int> pf(n+1);
        unordered_map<int, int> mp;
        mp[0 + k] = 1;
        int ans = 0;
        for (int i = 1; i <= n; ++i) {
            pf[i] = pf[i-1] + a[i-1];
            ans += mp[pf[i]];
            ++mp[pf[i] + k];
        }
        return ans;
    }
};
```

# [994. Rotting Oranges](https://leetcode.com/problems/rotting-oranges/description/)
>多源 bfs
```cpp
class Solution {
public:
    int orangesRotting(vector<vector<int>>& a) {
        int n = a.size(), m = a[0].size();
        queue<array<int,3>> q;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (a[i][j] == 2) {
                    q.push({i, j, 0});
                    a[i][j] = 0;
                }
            }
        }
        int dx[4]{0, 0, 1, -1};
        int dy[4]{1, -1, 0, 0};
        int mx = 0;
        while (!q.empty()) {
            auto [x, y, c] = q.front(); q.pop();
            mx = max(mx, c);
            for (int d = 0; d < 4; ++d) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                int nc = c + 1;
                if (0 <= nx && nx < n && 0 <= ny && ny < m && a[nx][ny] == 1) {
                    q.push({nx, ny, nc});
                    a[nx][ny] = 0;
                }
            }
        }

        for (auto& row : a) for (int x : row) if (x != 0) return -1;
        return mx;
    }
};
```

# [200. Number of Islands](https://leetcode.com/problems/number-of-islands/description/)
>bfs or dfs / 算 island 數量
```cpp
class Solution {
public:
    int numIslands(vector<vector<char>>& a) {
        int n = a.size(), m = a[0].size();
        
        const int dx[4]{0, 0, 1, -1};
        const int dy[4]{1, -1, 0, 0};
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) if (a[i][j] == '1') {
                ++ans;
                queue<pair<int,int>> q;
                q.push({i, j});
                a[i][j] = '0';
                while (!q.empty()) {
                    auto [x, y] = q.front(); q.pop();
                    for (int d = 0; d < 4; ++d) {
                        int nx = x + dx[d];
                        int ny = y + dy[d];
                        if (0 <= nx && nx < n && 0 <= ny && ny < m && a[nx][ny] == '1') {
                            a[nx][ny] = '0';
                            q.push({nx, ny});
                        }
                    }   
                }
                     
            }
        }
        return ans;
    }
};
```