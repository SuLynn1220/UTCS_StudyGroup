# [66. Plus One](https://leetcode.com/problems/plus-one/description/)
## Solution
```java
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else digits[i] = 0;
        }
        
        int[] d = new int[digits.length+1];
        d[0] = 1;
        return d;
    }
}
```

# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)
## Solution 1
>stack 經典判斷題
```java
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> t = new Stack<Character>(); 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') t.push(')');
            else if (s.charAt(i) == '[') t.push(']');
            else if (s.charAt(i) == '{') t.push('}');
            else {
                if (t.isEmpty() || s.charAt(i) != t.pop()) return false;
            }
        }
        return t.isEmpty();
    }
}
```