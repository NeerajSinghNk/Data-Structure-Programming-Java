/*
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
*/ 

public class CommonElementsInThreeSortedArray {
    void commonElement(int[] a1, int[] a2, int[] a3){
        int i=0,j=0,k=0;

        while(i<a1.length && j<a2.length && k<a3.length){
            if(a1[i]==a2[j] && a2[j]==a3[k]){
                System.out.print(a1[i]+" ");
                i++;j++;k++;
            }
            else if(a1[i] < a2[j]){
                i++;
            }
            else if(a2[j] < a3[k]){
                j++;
            }
            else{k++;}
        }
    }
    public static void main(String args[])
    {
       CommonElementsInThreeSortedArray ob = new CommonElementsInThreeSortedArray();
 
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
 
        System.out.print("Common elements are ");
        ob.commonElement(ar1, ar2, ar3);
    }
}