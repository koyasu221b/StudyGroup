public class ContainerWithMostWater {

    // Time Limit Exceeded
    public int maxArea1(int[] height) {
        int area = 0;
        for(int i = 0; i < height.length; i++){
            int left = height[i];
            for(int j= i+1; j < height.length; j++){
                int right = height[j];
                int width = j - i;
                int current = Math.min(left, right) * width;
                area = Math.max(area, current);
            }
        }

        return area;
    }

    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            int width = right - left;
            area = Math.max(
                    area,
                    width * Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }

        }

        return area;
    }
}
