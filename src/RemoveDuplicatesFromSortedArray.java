import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];

            }else{
            }
        }

        return j+1;
    }


    public static void main(String[] args) {
        int nums1[]  = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1));
        IntStream.of(nums1).forEach(x -> System.out.print( x));
    }
}
