import java.util.HashMap;
public class ScrambleString {
    static boolean solve(String a, String b){
    //   HashMap<String, Boolean> mp = new HashMap<>();
    //   StringBuilder s = new StringBuilder();
    //   s.append("a");
    //   s.append(" ");
    //   s.append("b");

        if(a.length() != b.length()){
            // System.out.println("String is not Scramble...");
            return false;
        }
        if(a.isEmpty() || b.isEmpty()){
            return false;
        }
        if(a.compareTo(b) == 0){
            return true;
        }
        if(a.length() <= 1){
            return false;
        }
        int n = a.length();
   
        for(int i=1;i<=n-1;i++){
            if (solve(a.substring(0, i),b.substring(0, i)) && solve(a.substring(i, n),b.substring(i, n)))
                {
                return true;
                }

                
            if (solve(a.substring(n - i, n),b.substring(0, i)) && solve(a.substring(0, n - i),b.substring(i, n)))
                {
                return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "great";
        String b = "eatrg";

       

        System.out.println(solve(a,b));
    }

}