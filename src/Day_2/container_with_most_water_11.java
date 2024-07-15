package Day_2;

public class container_with_most_water_11 {
    public static void main(String args[]){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int left = 0;
        int max_area = 0;
        int right = height.length-1;
        while(left<right){
            int currarea = Math.min(height[left], height[right]) * (right-left);
            max_area = Math.max(currarea, max_area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}
