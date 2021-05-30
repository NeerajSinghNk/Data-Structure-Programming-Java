public class PrintLCSBetweenTwoString {
    static void lcs(String s1, String s2, int m, int n){
        int[][] dp = new int[m+1][n+1];
         for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
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
        int index = dp[m][n];
        int temp = index;
        char[] ch = new char[index+1];
        ch[index] = '\u0000';
        int i = m, j = n;
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                ch[index-1] = s1.charAt(i-1);
                i--;
                j--;
                index--;
            }
            
            else if(dp[i-1][j] > dp[i][j-1]){
                    i--;
                }
            else{
                    j--;
                }
            
        }
        // System.out.println(Collections.reverse(str));
        // return dp[m][n];
        for(int k=0;k<=temp;k++){
            System.out.print(ch[k]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // PrintLCSBetweenTwoString pb = new PrintLCSBetweenTwoString();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int x = s1.length();
        int y = s2.length();
        lcs(s1,s2,x,y);
        // System.out.println("LCS "+ lcs(s1,s2,x,y));
    }
}