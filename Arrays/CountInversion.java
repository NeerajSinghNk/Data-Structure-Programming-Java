/*
Inversion Count for an array indicates - how far (or close) the array is from being sorted. 
If the array is already sorted, then the inversion count is 0, 
but if the array is sorted in the reverse order, the inversion count is the maximum. 
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j 
*/

public class CountInversion {
    static long inversionCount(long arr[], long N)
    {
        int count=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String args[]){
        long[] arr = {8, 4, 2, 1};
        int N = arr.length;
        System.out.println("Inverse NUmber: "+inversionCount(arr,N));
    }
}