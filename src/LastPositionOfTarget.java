public class LastPositionOfTarget {
    public static int lastPosition(int[] nums, int target) {
        // write your code here
        if(nums == null || nums.length == 0){
            return -1;
        }
        int n  = nums.length;
        int start = 0;
        int end = n - 1;
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
               start = mid;
            }else if(target < nums[mid]){
               end = mid;
            }else {
                start = mid;
            }
        }

        if(nums[end] == target){
            return end;
        }else if(nums[start] == target){
            return start;
        }

        return -1;

    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 4, 5, 5};
        System.out.println(lastPosition(nums, 2));
        System.out.println(lastPosition(nums, 5));
        System.out.println(lastPosition(nums, 6));
    }
}
