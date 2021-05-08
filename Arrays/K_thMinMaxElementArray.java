import java.util.*;
public class K_thMinMaxElementArray {
    
    public static void findK_MinMaxElementInArray(int[] arr, int k){
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("Min Element "+arr[k-1]);
        System.out.println("Max Element "+arr[n-k]);
        
    }

    public static void main(String[] args) {
        int arr[] = {7 ,10 ,4  ,20 ,15};
        findK_MinMaxElementInArray(arr,4);
    }
}