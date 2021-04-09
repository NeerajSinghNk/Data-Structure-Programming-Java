
public class StringRecursion {
    public static void main(String[] args) {
        
        String s = "malayalam";
        int l=0;
        int r=s.length()-1;
        int i=0;
        String curr = "";
        String str = "abc";
        permute(str, i, str.length()-1);
    //    powerSet(str, i, curr);
        // System.out.println(isPalin(s, l, r));
    }


    public static boolean isPalin(String s, int l, int r){
       
        if(l>=r){
            return true;
        }
        if((s.charAt(l)) != (s.charAt(r))){
            return false;
        }

        return isPalin(s,l+1,r-1);
    }


    //Print the powerset of string


    public static void powerSet(String s, int i, String cur){
        
        if(i==s.length()){
            System.out.println(cur);
            return ;
        }
        
        powerSet(s, i+1,cur+s.charAt(i));
        powerSet(s, i+1, cur);
    }

    //Print all Permutation of a given string

    public static void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 

    public static String swap(String s, int l, int r){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[l];
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }
}