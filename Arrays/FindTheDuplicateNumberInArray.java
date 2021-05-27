public class FindTheDuplicateNumberInArray {
    
    public static int findDuplicate(int[] nums) {
        int sum=0;
        int n=nums.length-1;
        for(int i=0;i<nums.length;i++){
           sum +=nums[i];
        }
        int result = sum - ((n+1)*n)/2;
        return result;
    }

    public static void main(String ar[]){
        int arr[] = {1,2,2,3};
        System.out.println(findDuplicate(arr));
    }
}