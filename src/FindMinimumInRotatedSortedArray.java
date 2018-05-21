public class FindMinimumInRotatedSortedArray {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public static int findMin(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] <= nums[end]){
                end = mid;
            }else{
                start = mid;
            }
        }

        if(nums[end] < nums[start]){
            return nums[end];
        }else{
            return nums[start];
        }

    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{0, 1, 2, 4, 5, 6, 7}));
    }
}
