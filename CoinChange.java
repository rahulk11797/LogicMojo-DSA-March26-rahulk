/*
1. Given an integer array of coins[ ] of size N representing different types of currency and an integer sum, The task is to find the number of ways to make sum by using different combinations from coins[]. 
Note: Assume that you have an infinite supply of each type of coin.
 
Input: sum = 4, coins[] = {1,2,3},
Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}
*/

public class CoinChange {

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = dp[i] + dp[i - coin];
            }
        }
    
        return dp[amount];
    }

    public static void main(String[] args) {
        int targetSum = 4;
        int[] coinsArray = {1, 2, 3};
        
        int ways = change(targetSum, coinsArray);
        System.out.println("Number of ways: " + ways);
    }
}