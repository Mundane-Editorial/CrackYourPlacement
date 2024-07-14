package Day_1;
import java.util.TreeSet;
public interface remove_duplicates_from_sorted_array_26 {
    public static void main(String args[]){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            treeSet.add(nums[i]);
        }
        Integer[] uniqueElements = treeSet.toArray(new Integer[0]);

        for (int i = 0; i < uniqueElements.length; i++) {
            nums[i] = uniqueElements[i];
        }
        return treeSet.size();
    }
}
