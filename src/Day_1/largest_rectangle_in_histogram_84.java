package Day_1;

import java.util.Stack;

public class largest_rectangle_in_histogram_84 {
    public static void main(String args[]){
        int[] height = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(height));
    }

    private static int largestRectangleArea(int[] height) {
        int maxans = 0;
        int[] ps = prevsmaller(height);
        int[] ns = nextsmaller(height);
        for(int i = 0; i<height.length; i++){
            int curr = (ns[i] - ps[i] - 1) * height[i];
            maxans = Math.max(maxans, curr);
        }
        return maxans;
    }

    private static int[] nextsmaller(int[] height) {
        int ns[] = new int[height.length];
        Stack<Integer> s = new Stack<>();

        for(int i = height.length-1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i])
            {
                s.pop();
            }
            if (s.isEmpty()){
                ns[i]= height.length;
            }else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }

    private static int[] prevsmaller(int[] height) {
        int ps[] = new int[height.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<height.length; i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if (s.isEmpty()){
                ps[i]= -1;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
}
