// Problem: Dice Throw
// Platform: GeeksforGeeks POTD
// Date: 2026-03-07
// Approach: Dynamic Programming
// Time Complexity: O(n * x * m)
// Space Complexity: O(n * x)
// Language: Java

class Solution {
    static int noOfWays(int m, int n, int x) {
        int[][] dp = new int[n+1][x+1];

        dp[0][0] = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= x; j++){

                for(int k = 1; k <= m && k <= j; k++){
                    dp[i][j] += dp[i-1][j-k];
                }

            }
        }

        return dp[n][x];
    }
}
