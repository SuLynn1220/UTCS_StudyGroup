# [1979. Find Greatest Common Divisor of Array](https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/)
## Solution 1
>輾轉相除法
```java
class Solution {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    public int findGCD(int[] nums) {
        int mx = 0, mn = 1000;
        for (int x : nums) {
            mx = Math.max(mx, x);
            mn = Math.min(mn, x);
        }
        return gcd(mx, mn);
    }
}
```

## Solution 2
>迴圈窮舉
```java
class Solution {
    public int findGCD(int[] nums) {
        int mx = 0, mn = 1000;
        for (int x : nums) {
            mx = Math.max(mx, x);
            mn = Math.min(mn, x);
        }

        for (int i = mn; i >= 2; i--) {
            if (mn % i == 0 && mx % i == 0) return i;
        }
        return 1;
    }
}
```

# [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)
## Solution 1
>數學運算：透過 % 取餘數將數字翻轉
```java
class Solution {
    public boolean isPalindrome(int x) {
        int prev = x, rev = 0;
        while (x > 0) {
            int curr = x % 10;
            rev = rev * 10 + curr;
            x /= 10;
        }

        return prev == rev;
    }
}
```

## Solution 2
>字串翻轉
```java
class Solution {
    public boolean isPalindrome(int x) {
        String rev = Integer.toString(x);
        int l = 0, r = rev.length() - 1;
        while (l < r) {
            if (rev.charAt(l) != rev.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
```