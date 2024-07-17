package Day_4;

import java.util.HashMap;

public class Subarray_Sums_Divisible_by_K_974 {
    public static void main(String args[]){
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }

    private static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        for(int i : nums) {
            sum = (i+sum)%k;
            if(sum < 0) sum += k;
            if(map.containsKey(sum)) count += map.get(sum);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
