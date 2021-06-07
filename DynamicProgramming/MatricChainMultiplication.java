import java.util.Arrays;
public class MatricChainMultiplication {
    // Recursive Solution
    static int solve(int[] arr, int i, int j){
        int min = Integer.MAX_VALUE;
        if(i>=j){
            return 0;
        }
        for(int k=i;k<=j-1;k++){
            int tempAns = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1] * arr[k] * arr[j]);
            if(tempAns < min){
                min = tempAns;
            }
        }
        return min;
    }

    // Memoization Bottom up method
    static int[][] dp = new int[1001][1001];
    static int solve1(int[] arr, int i, int j){
        if(i>=j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int tempAns = solve1(arr,i,k) + solve1(arr,k+1,j) + (arr[i-1] * arr[k] * arr[j]);
            if(tempAns < min){
                min = tempAns;
            }
        }
        dp[i][j] = min;
        return dp[i][j];

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int i = 1;
        int j = n-1;
        System.out.println("Recursive Call = "+solve(arr,i,j));
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        System.out.println("Memoization Call = "+solve1(arr,i,j));
        
    }
}