# [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/description/) 
>dp 但應該是 two pointer 就可以了

## one pass solution
```cpp
class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        int l = 0, r = n-1;
        int lmx = 0, rmx = 0;
        int ans = 0;
        while (l <= r) {
            int mx = max(lmx, rmx);
            int add;
            if (height[l] < height[r]) {
                add = max(mx - height[l], 0);
                lmx = max(lmx, height[l++]);
            } else {
                add = max(mx - height[r], 0);
                rmx = max(rmx, height[r--]);
            }
            ans += add;
        }
        return ans;
    }
};
```

# [41. First Missing Positive](https://leetcode.com/problems/first-missing-positive/description/)
>sorting
## Time : O(nlogn) + Extra Space : O(1)
```cpp
class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        int ans = 1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == ans) ++ans;
        }
        return ans;
    }
};
```

## Time : O(n) + Extra Space : O(1)
```cpp
class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n = nums.size();
        for (int i = 0; i < n; ++i) {
            while (1 <= nums[i] && nums[i] <= n && nums[i] != nums[nums[i]-1]) {
                swap(nums[i], nums[nums[i]-1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i+1) return i+1;
        }
        return n+1;
    }
};
```

## Time : O(n) + Extra Space : O(n)
```cpp
class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int n = nums.size();
        vector<bool> vis(n+2);
        for (int i = 0; i < n; ++i) {
            if (1 <= nums[i] && nums[i] <= n) vis[nums[i]] = 1;
        }

        for (int i = 1; i <= n+1; ++i) if (!vis[i]) return i;
        return n+1;
    }
};
```

# [55. Jump Game](https://leetcode.com/problems/jump-game/description/?envType=problem-list-v2&envId=dynamic-programming)
>dp
## Time : O(n^2)
```cpp
class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n);
        dp[n-1] = 1;
        for (int i = n-2; i >= 0; --i) {
            for (int j = 1; j <= nums[i] && i + j <= n-1; ++j) {
                dp[i] |= dp[i+j];
                if (dp[i]) break;
            }
        }
        return dp[0];
    }
};
```

## Time : O(n)
```cpp
class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        int mx = 0;
        for (int i = 0; i < n; ++i) {
            if (i > mx) {
                return 0;
            }

            mx = max(mx, i + nums[i]);
        }
        return 1;
    }
};
```