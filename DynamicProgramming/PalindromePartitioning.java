import java.util.Arrays;
public class  PalindromePartitioning {
    // Recursive Method
    static int solve(String str, int i, int j){
        int min = Integer.MAX_VALUE;
        if(i>=j){
            return 0;
        }
        if(isPalinDrome(str, i, j)){
            return 0;
        }
        for(int k =i;k<=j-1;k++){
            int tempAns = 1 + solve(str,i , k) + solve(str,k+1,j);
            if(tempAns < min){
                min = tempAns;
            }
        }

        return min;
    }
    static int[][] dp = new int[1001][1001];
    // Bottom up Approach
    static int solve1(String str,int i,int j){
        int min = Integer.MAX_VALUE;
        if(i>=j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(isPalinDrome(str, i, j)){
            return 0;
        }
        int left, right;
        for(int k=i;k<=j-1;k++){
            // int tempAns = 1+solve1(str, i,k) + solve1(str,k+1,j); //One line code is not optimize
            
        //    Optimize Code started form here.....
            if(dp[i][k] != -1){
                left = dp[i][k];
            }
            else{
                left = solve1(str,i,k);
                dp[i][k] = left;
            }
            if(dp[k+1][j] != -1){
                right = dp[k+1][j];
            }
            else{
                right = solve1(str,k+1,j);
                dp[k+1][j] = right;
            }
            int tempAns = 1 + left + right;
            if(tempAns < min){
                min = tempAns;
            }
        }

        dp[i][j] = min;
        return dp[i][j];
    }

    static boolean isPalinDrome(String str, int i, int j){
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "neeraj";
        int n = str.length();
        int i = 0;
        int j = n-1;
        System.out.println("No. of partition in Recursive Solution  "+solve(str,i,j));
        for(int[] row: dp){
            Arrays.fill(row, -1);
        } 
           System.out.println("No. of partition in DP Solution  "+solve1(str,i,j));
    }
}