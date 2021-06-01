public class SequencePatternMatching {
    static int lcs(String s1, String s2, int m , int n){
        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }

    static boolean matching(String s1, String s2, int m , int n){
        int lcs = lcs(s1,s2,m,n);
        int str = s1.length();

        if(lcs == str){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String X = "GTB";
		String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
		System.out.println(matching(X, Y,m,n));
    }
}