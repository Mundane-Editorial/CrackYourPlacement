package Day_2;

import java.util.*;
public class two_sum_1 {
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] res = twosum(nums, target);
        System.out.println(res.toString());
    }

    private static int[] twosum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
