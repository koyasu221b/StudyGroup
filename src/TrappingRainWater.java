public class TrappingRainWater {

    public static int trap(int[] height) {
        int totalAmount = 0;
        if (height == null || height.length == 0){
            return totalAmount;
        }

        int[] leftHighest = new int[height.length];
        leftHighest[0] = 0;

        for(int i = 1; i < height.length; i++){
            leftHighest[i] = Math.max(leftHighest[i-1], height[i-1]);
            System.out.print(leftHighest[i]);
        }

        int rightHighest = 0;
        for(int i = height.length - 1; i >= 0; i--){
            rightHighest = Math.max(rightHighest, height[i]);

            if(Math.min(leftHighest[i], rightHighest) > height[i]){
                totalAmount += (Math.min(leftHighest[i], rightHighest)  - height[i]);

            }
        }

        return totalAmount;
    }

    public static void main(String[] args) {
        int[]height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

//        int[]height2 = {2, 0, 2};
//        System.out.println(trap(height2));

    }
}
