import java.lang.*;
import java.util.*;

public class QueueEn {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int Q = inp.nextInt();
        inp.nextLine();
        Queue < Integer > q = new ArrayDeque < > ();
        for (int i = 0; i < Q; i++) {
            int x = inp.nextInt();
            int y = inp.nextInt();
            inp.nextLine();
            if (x == 1)
                q.offer(y);
            else if (x == 2) {
                if (q.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(q.peek());

            } else {
                if (q.size() == 0)
                    continue;
                else
                    q.poll();
            }
        }
        inp.close();
    }
}



