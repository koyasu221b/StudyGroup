public class MoveZeroes {
    public static void moveZeroes2(int[] nums) {
        for(int i=0; i< nums.length; i++){
            if(nums[i] != 0){
                for(int j=0; j < i; j++){
                    if(nums[j] == 0){
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int j = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }else {
               if(i == j){
                   j++;
                   continue;
               }
               nums[j]  = nums[i];
               j++;
            }
        }

        for(int i=0; i<zeroCount; i++){
            nums[nums.length - 1 -i] = 0;
        }
    }

    public static void display(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
       display(nums);

       int[] nums2 = new int[]{2, 1};
        moveZeroes(nums2);
        display(nums2);
    }
}
