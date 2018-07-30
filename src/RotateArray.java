public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return;
        }
        k  = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length -1);
        reverse(nums, 0, nums.length -1);
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end){
            start++;
            end--;
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
    }

}
