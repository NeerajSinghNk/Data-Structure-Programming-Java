public class BooleanParenthesization {
    static int solve(String str, int i, int j, int isTrue){
        if(i>j){
            return 0;
        }
        if(i==j){
            if(isTrue == 1){
                return (str.charAt(i) == 'T') ? 1 : 0;
            }
            else{
                return (str.charAt(i) == 'F') ? 1: 0;
            }
        }
        int ans=0;
        int LT = 0,RT = 0,RF = 0,LF = 0;
        for(int k=i+1;k<=j-1;k=k+2){
            LT = solve(str,i,k-1,1);
            LF = solve(str,i,k-1,0);
            LT = solve(str,k+1,j,1);
            LF = solve(str,k+1,j,0);

            if(str.charAt(k) == '&'){
                if(isTrue == 1){
                    ans = ans + LT * RT;
                }
                else{
                    ans = ans + LF*RT + LT*RF + LF*RF;
                }
            }
            else if(str.charAt(k) == '|'){
                if(isTrue == 1){
                    ans = ans +  LT*RT + LT*RF + LF*RT;
                }
                else{
                    ans = ans + LF*RF;
                }
            }
            else if(str.charAt(k) == '^'){
                if(isTrue == 1){
                    ans = ans + LF*RT + LT*RF;
                }
                else{
                    ans = ans + LT*RT + LF*RF;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String symbols = "TTFT";
        String operators = "|&^"; 
        StringBuilder s = new StringBuilder();
        int l = 0;
        for(int k=0;k<symbols.length();k++){
            s.append(symbols.charAt(k));
            if(l < operators.length()){
                s.append(operators.charAt(l++));
            }
        }

        int i = 0;
        int j = s.length()-1;
        System.out.println(solve(s.toString(),i,j,1));

    }
}