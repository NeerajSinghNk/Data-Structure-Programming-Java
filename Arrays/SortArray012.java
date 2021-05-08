public class SortArray012 {
    public static void sort012(int arr[],int n){
        // int[] temp = new int[n];
       
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
     
        for( i=0;i<n;i++){
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
                }
        }
        i=0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
     
        // Then all the 1s
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }
     
        // Finally all the 2s
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        for( i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String ars[]){
        int[] arr = {0,1,0,1,0,1,2,2,2,0,0,1,0,1};
        int n=arr.length;
        sort012(arr,n);
    }
    
}