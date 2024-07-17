package Day_4;

import java.util.HashMap;

public class subarray_sum_equal_k_560 {
    public static void main(String args[]){
        int[] nums = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }

    private static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int presum = 0, count = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            int remove = presum - k;
            count += map.getOrDefault(remove, 0);
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }
        return count;
    }
}
