public class ReverseArray {

    public static void reverseArray(int[] arr){
        // Reverse Array using for loop.............
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }

        // Reverse Array using while loop;
        int start=0,end=arr.length-1;
        int temp;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // This Method will print the array
    static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
        System.out.println("Reverse Array");
        printArray(arr);
    }
}