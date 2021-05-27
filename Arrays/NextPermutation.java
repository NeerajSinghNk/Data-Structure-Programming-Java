import java.util.Arrays;
public class NextPermutation {
    public static boolean nextPermutation(int[] nums) {
        
        if(nums.length<=1){
            return false;
        }
        int last = nums.length-2;
        while(last>=0){
            if(nums[last] < nums[last+1]){
                break;
            }
            last--;
        }

        if(last<0){
            return false;
        }

        int nextGrater = nums.length-1;

        for(int i=nums.length-1;i>last;i++){
            if(nums[i]>nums[last]){
                nextGrater = i;
                break;
            }
        }

        nums = swap(nums,nextGrater,last);
        nums = reverse(nums,last+1,nums.length-1);

        return true;

    }

    public static int[] swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return arr;
    }

    public static int[] reverse(int[] arr, int l, int r){
     int temp = arr[l];
     arr[l++] = arr[r];
     arr[r--] = temp;
     return arr;   
    }


    public static void main(String args[]){
        int data[] = { 1, 2, 3 };
        if (!nextPermutation(data))
        System.out.println("There is no higher"
                           + " order permutation "
                           + "for the given data.");
    else {
        System.out.println(Arrays.toString(data));
    }
    }
}