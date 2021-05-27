/*
Given an array of positive and negative numbers, arrange them in an alternate fashion such that every
 positive number is followed by negative and vice-versa. Order of elements in output doesn’t matter.
 Extra positive or negative elements should be moved to end.
 Input :
arr[] = {-2, 3, 4, -1}
Output :
arr[] = {-2, 3, -1, 4} OR {-1, 3, -2, 4} OR ..

*/ 

public class RearrangeArrayAlternatingNegitiveAndPositive {
    
    public static void rearrange(int[] arr,int n){
        int i=0,j=n-1;

        while(i<j){
            while(i<=n-1 && arr[i]>0){
                i++;
            }
            while(j>=0 && arr[j] <0){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }

        if(i==0 || i==n){
            return ;
        }
        int k=0;
        while(k<n && i<n){
            swap(arr,k,i);
            i++;
            k=k+2;        }
        }

    static void printArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String args[]){
        int[] arr = {-2, 3, 4, -1};
        int n = arr.length;
        System.out.println("Given array is ");
        printArray(arr, n);
    
        rearrange(arr, n);
    
        System.out.println("Rearranged array is ");
        printArray(arr, n);
    }
}