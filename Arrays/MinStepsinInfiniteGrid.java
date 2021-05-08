public class MinStepsinInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count=0;
        int x = A.get(0);
        int y = B.get(0);
        for(int i=1;i<A.size();i++)
        {
            int xx = A.get(i)-x;
            int yy = B.get(i)-y;
            int dif = Math.max(Math.abs(xx),Math.abs(yy));
            count +=dif;
            x = A.get(i);
            y = B.get(i);
            
        }
        return count;
    }
}
