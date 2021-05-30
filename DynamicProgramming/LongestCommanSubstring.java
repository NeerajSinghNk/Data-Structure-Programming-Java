public class LongestCommanSubstring {
    static int lcs(int x, int y, String s1, String s2){
        int[][] dp = new int[x+1][y+1];

        for(int i=0;i<x+1;i++){
            for(int j =0;j<y+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<x+1;i++){
            for(int j=1;j<y+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 0;
                }   
            }
        }
        return dp[x][y];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int x = s1.length();
        int y = s2.length();
        System.out.println("Recursion O/P-> "+ lcs(x,y,s1,s2));
    }
}