import java.util.*;

public class House{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt();
        
        // while(sc.hasNextInt()){
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            System.out.println(minBox(r,c));
        // }
    } 
    
    
    
    
    static int minBox(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        return minBox(r-1,c)+minBox(r,c-1);
    }
    
}