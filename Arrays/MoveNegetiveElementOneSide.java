public class MoveNegetiveElementOneSide {
    
    public static void moveNegetiveElement(int[] arr){
        int n=arr.length;
        int temp,j=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        moveNegetiveElement(arr);
        printArray(arr);
    }
}