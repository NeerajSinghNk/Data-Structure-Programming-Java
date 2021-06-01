public class LCSOfThreeStrings {
   static int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        int[][][] dp = new int[n1+1][n2+1][n3+1];
        for(int i=0;i<n1+1;i++){
            for(int j=0;j<n2+1;j++){
                for(int k=0;k<n3+1;k++){
                    dp[i][j][k] = 0;
                }
            }
        }
        
        for(int i=1;i<n1+1;i++){
            for(int j=1;j<n2+1;j++){
                for(int k=1;k<n3+1;k++){
                    if(A.charAt(i-1) == B.charAt(j-1) && A.charAt(i-1) == C.charAt(k-1)){
                        dp[i][j][k] = 1+dp[i-1][j-1][k-1];
                    }
                    else{
                        dp[i][j][k] = Math.max(Math.max(dp[i-1][j][k],dp[i][j-1][k]),dp[i][j][k-1]);
                    }
                }
            }
        }
        return dp[n1][n2][n3];
    }

    public static void main(String[] args) {
        String X = "AGGT12";
        String Y = "12TXAYB";
        String Z = "12XBA";
      
        int m = X.length();
        int n = Y.length();
        int o = Z.length();
      
        System.out.println("Length of LCS is " +LCSof3(X, Y,Z, m, n, o));
    }
}