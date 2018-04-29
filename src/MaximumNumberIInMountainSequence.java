public class MaximumNumberIInMountainSequence {
    /**
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public static int mountainSequence(int[] nums) {
        // write your code here
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid-1]){
                start = mid;
            }else{
                end = mid;
            }
        }

        return Math.max(nums[start], nums[end]) ;

    }

    public static void main(String[] args) {
        System.out.println(mountainSequence(new int[]{1, 2, 4, 8, 6, 3}));
        System.out.println(mountainSequence(new int[]{10, 9, 8, 7}));
    }
}
