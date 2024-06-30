class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2; // You can climb 1 step twice or climb 2 steps at once
        }
        int prev1 = 1, prev3 = 1, curr = 2;
        for (int i = 3; i <= n; i++) {
            int temp = curr;
            curr = prev1 + prev3;
            prev1 = prev3;
            prev3 = temp;
        }
        return curr;
    }
}

 