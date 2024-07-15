package Day_2;

import java.util.*;

public class find_duplicates_in_an_array_442 {
    public static void main(String args[]){
        int[] nums  = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    private static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                duplicates.add(num);
            } else {
                set.add(num);
            }
        }

        return duplicates;
    }
}
