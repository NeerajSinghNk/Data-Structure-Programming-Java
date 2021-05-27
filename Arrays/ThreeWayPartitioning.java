/*
Given an array of size n and a range [a, b]. The task is to partition the array around the range such 
that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified 
array.


Example 1:

Input: 
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 1
Explanation: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid
arrangement, output will be 1.
*/ 

public class ThreeWayPartitioning {
    public static void threeWayPartition(int arr[], int a, int b)
    {
        int n = arr.length;
        int start = 0, end = n-1;
        
        for(int i=0;i<=end;){

           if(arr[i] < a){
               int temp = arr[start];
               arr[start] = arr[i];
               arr[i] = temp;
               start++;
               i++;
           }
           else if(arr[i] > b){
               int temp = arr[end];
               arr[end] = arr[i];
               arr[i] = temp;
               end--;
           }
           else{
               i++;
           }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
         
        threeWayPartition(arr, 10, 20);
  
        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
     
        }  
    }
}
// o/p 1 5 4 2 1 3 14 20 20 98 87 32 54 