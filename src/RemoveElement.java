import java.util.stream.IntStream;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right){
           if(nums[left]  == val) {
              nums[left]  = nums[right];
              right--;
           }else {
               left++;
           }

        }

        return right + 1;

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums1, 2));
        IntStream.of(nums1).forEach(x-> System.out.print(x));
        System.out.println();


        int[] nums2 = new int[]{2,2};
        System.out.println(removeElement(nums2, 2));
        IntStream.of(nums2).forEach(x-> System.out.print(x));
        System.out.println();

        int[] nums3 = new int[]{2};
        System.out.println(removeElement(nums2, 2));
        IntStream.of(nums2).forEach(x-> System.out.print(x));

        int[] nums4 = new int[]{0,4,4,0,4,4,4,0,2};
        removeElement(nums4, 4);
    }
}
