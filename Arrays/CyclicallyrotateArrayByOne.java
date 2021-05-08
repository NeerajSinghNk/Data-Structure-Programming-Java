import java.util.*;
public class CyclicallyrotateArrayByOne {
    
    public static void rotateArrayByOne(int arr[]){
        int index = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = index;
    }

    public static void main(String ar[]){
        int arr[] = {1,2,3,4,5};
        
        System.out.println(Arrays.toString(arr));
         
        rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
         
    }
}