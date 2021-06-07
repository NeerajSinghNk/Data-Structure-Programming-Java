import java.util.Arrays;
public class EggDropping {
    // Recursive Approach
    static int solve(int e, int f){
        if(f == 1 || f == 0){
            return f;
        }
        if(e == 1){
            return f;
        }
        int min = Integer.MAX_VALUE;
        int temp,k;
        for( k=1;k<=f;k++){
             temp = 1 + Math.max(solve(e-1,k-1),solve(e,f-k));
            min = Math.min(temp,min);
        }
        return min;
    }        

    // Memorizing method with space optimization
    static int[][]dp = new int[1001][1001];
    static int solve1(int e, int f){
        // int[][] dp = new int[e+1][f+1];
        if(f == 1 || f == 0){
            return f;
        }
        if(e == 1){
            return f;
        }
        if(dp[e][f] != -1){
            return dp[e][f];
        }
        int min = Integer.MAX_VALUE;
        int left = 0, right = 0;
        for(int k=1;k<=f;k++){
            // int temp = 1 + Math.max(solve(e-1,k-1),solve(e,f-k));
           if(dp[e-1][k-1] != -1){
               left = dp[e-1][k-1];
           }
           else{
               left = solve1(e-1,k-1);
               dp[e-1][k-1] = left;
           }
           if(dp[e][f-k] != -1){
               right = dp[e][f-k];
           }
           else{
               right = solve1(e,f-k);
               dp[e][f-k] = right;
           }
            int temp = 1 + Math.max(left,right);
            min = Math.min(temp,min);
        }
        dp[e][f] = min;
        return dp[e][f];
    }        
    public static void main(String[] args) {
        int e = 2;
        int f = 10;
        System.out.println("Number of trials when number of eggs is " +e + " and number of floors is " +f+ " : "+solve(e,f));
        for(int[] row: dp){
            Arrays.fill(row, -1);
        } 
        System.out.println("Number of trials when number of eggs is " +e + " and number of floors is " +f+ " : "+solve1(e,f));
       
    }
}