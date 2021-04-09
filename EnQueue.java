import java.lang.*;
import java.util.*;

public class EnQueue {
    public static void main(String[] args) {
        Deque<Integer> dq= new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- != 0){
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            
            if(x == 1){
                dq.offerLast(y);
            }
            
            else if(x == 2){
                dq.offerFirst(y);
            }
            
            else if(x == 3){
                if(dq.size() == 0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(dq.peekFirst());
                }
            }
            
            else if(x == 4){
                if(dq.size() == 0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(dq.peekLast());
                }
            }
            
            else if(x == 5){
                if(dq.size() == 0){
                    continue;
                }
                else{
                    dq.pollFirst();
                }
            }
            
            else{
                if(dq.size() == 0){
                    continue;
                }
                else{
                    dq.pollLast();
                }
            }
            
        }
        sc.close();
        
        
    }
}