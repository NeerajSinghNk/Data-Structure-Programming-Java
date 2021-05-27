public class MinMaxElementArray {
    
    public static void minMaxElementInArray(int arr[]){
        int min,max;
        min = arr[0];
        max = arr[0];

        for(int i=0;i<arr.length;i++){

            // Maximum element in an array
            if(arr[i]>max){
                max = arr[i];
            }

            // Minimum element in an array
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max Element "+max);
        System.out.println("Min Element "+min);
    }

    public static void main(String args[]) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        minMaxElementInArray(arr);
    }
}