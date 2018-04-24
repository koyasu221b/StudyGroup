public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int[] s = new int[nums.length];
        s[0] = nums[0];
        for(int i=1; i < nums.length ; i++){
           s[i]  = nums[i] + s[i-1];
        }

        int ans = nums[0];
        int minSum = 0;
        for(int i = 0; i < nums.length ; i++) {
            ans = Math.max(ans, s[i] - minSum);
            minSum = Math.min(minSum, s[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
